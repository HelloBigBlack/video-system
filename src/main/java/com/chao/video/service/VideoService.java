package com.chao.video.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chao.video.bean.Video;
import com.chao.video.bean.VideoClass;
import com.chao.video.bean.VideoMessage;
import com.chao.video.dao.VideosMapper;
import com.chao.video.utils.FileUtils;

@Service
public class VideoService {
	
	@Autowired
	private VideosMapper mapper;
	
	public Video getVideoById(Integer id){
		return mapper.selectByPrimaryKey(id);
	}
	
	public void updateVideoById(Video video){
		mapper.updateByPrimaryKeySelective(video);
	}
	
	public List<Video> getVideosByVideoMessage(VideoMessage message){
		
		return mapper.getVideosByVideoMessage(message);
	}
	
	public void addVideo(Video video){
		mapper.insert(video);
	}
	
	public void deleteVideobyPrimaryKey(Integer id){
		Video video = mapper.selectByPrimaryKey(id);
		FileUtils.deleteFile("d:\\123\\video\\" + video.getVideoUrl());
		FileUtils.deleteFile("d:\\123\\images\\" + video.getImgUrl());
		mapper.deleteByPrimaryKey(id);
	}
	
	public List<VideoClass> getVideoClasses(){
		return mapper.getVideoClasses();
	}
}
