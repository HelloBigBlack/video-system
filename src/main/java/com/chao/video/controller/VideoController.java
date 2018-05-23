package com.chao.video.controller;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.chao.video.bean.Video;
import com.chao.video.bean.VideoMessage;
import com.chao.video.service.VideoService;
import com.chao.video.utils.FileUtils;
import com.chao.video.utils.Msg;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncoderException;
import it.sauronsoftware.jave.MultimediaInfo;

@Controller
@RequestMapping("video")
@CrossOrigin("*")
public class VideoController {
	@Autowired
	private VideoService service;
	
	/**
	 * 根据videoMessage来获取视频列表，VideoMessage保存了查询的信息
	 * @param videoMessage
	 * @param num
	 * @return
	 */
	@RequestMapping("/getVideos")
	@ResponseBody
	public Msg getVideos(@RequestBody VideoMessage videoMessage, @RequestParam Integer num){
		PageHelper.startPage(1, num);
		List<Video> videos = service.getVideosByVideoMessage(videoMessage);
		PageInfo<Video> pageInfo = new PageInfo<>(videos, 5);
		return Msg.success().add("pageInfo", pageInfo);
	}
	
	/**
	 * 根据视频id获取视频
	 * @param id
	 * @return
	 */
	@RequestMapping("/getVideoById")
	@ResponseBody
	public Msg getVideoById(@RequestParam Integer id){
		return Msg.success().add("video", service.getVideoById(id));
	}
	
	/**
	 * 传入一个新的video对象，根据video对象的id更新视频
	 * @param video
	 * @return
	 */
	@RequestMapping("/updateVideoById")
	@ResponseBody
	public Msg updateVideoById(@RequestBody Video video){
		service.updateVideoById(video);
		System.out.println(video);
		return Msg.success();
	}
	
	/*
	 * 根据视频id删除视频
	 */
	@RequestMapping("/delVideoById")
	@ResponseBody
	public Msg deleteVideoById(@RequestParam Integer id){
		service.deleteVideobyPrimaryKey(id);
		return Msg.success();
	}
	
	/*
	 * 获取视频分类的列表
	 */
	@RequestMapping("/getVideoClasses")
	@ResponseBody
	public Msg getVideoClasses(){
		return Msg.success().add("videoClasses", service.getVideoClasses());
	}

	/*
	 * 更具VideoMessage来获取video列表，VideoMessage保存了查询的信息
	 */
	@RequestMapping(value = "/getByMessage", method=RequestMethod.POST)
	@ResponseBody
	public Msg getVideosByVideoMessage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			@RequestParam(value="num", defaultValue="10") Integer num,@RequestBody VideoMessage message) {
		PageHelper.startPage(pn, num); // 执行这条语句，就可以实现分页查询
		List<Video> videos = service.getVideosByVideoMessage(message);
		PageInfo<Video> pageInfo = new PageInfo<>(videos, 5); // 使用pageInfo 来包装查询出的视频列表
		return Msg.success().add("pageInfo", pageInfo);
	}

	/*
	 * 插入视频
	 */
	@RequestMapping("/add")
	@ResponseBody
	public Msg addVideo(Video video, @RequestParam("videoFile")CommonsMultipartFile videoFile,@RequestParam("imgFile") CommonsMultipartFile imgFile, HttpServletRequest request) throws IOException {

		if(videoFile.getSize() == 0){
			return Msg.fail();
		}
		String videoPath = "d:\\123\\video\\";
		
		//获取一个随机名字
		String videoName = FileUtils.buildRoundName(videoFile);
		
		//调用FileUtils的upload方法保存文件
		FileUtils.upload(videoPath, videoName, videoFile);
		
		video.setVideoUrl(videoName);
		
		File file = new File(videoPath + videoName);
		Encoder encoder = new Encoder();
        MultimediaInfo multimediaInfo;
        int stime = 0;
        try {
        	
        	//获取视频的时长
			multimediaInfo = encoder.getInfo(file);
			stime = (int)multimediaInfo.getDuration();
			stime = stime / 1000;
		} catch (EncoderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		video.setVideoTime(stime);
		
		//保存视频封面图片
		if(imgFile.getSize() != 0){
			String imgPath = "d:\\123\\images\\";
			String imgName = FileUtils.buildRoundName(imgFile);
			FileUtils.upload(imgPath, imgName, imgFile);
			video.setImgUrl(imgName);
		}else {
			video.setImgUrl(null);
		}
		
		service.addVideo(video);
		
		return Msg.success().add("video", video);
	}
	
}
