package com.chao.video.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chao.video.bean.MessageBox;
import com.chao.video.service.MessageBoxService;
import com.chao.video.utils.Msg;

@Controller
@RequestMapping("message")
@CrossOrigin("*")
public class MessageBoxController {
	@Autowired
	private MessageBoxService service;
	
	@RequestMapping("/addMessageBox")
	@ResponseBody
	public Msg addMessageBox(@RequestBody MessageBox messageBox){
		service.addMessageBox(messageBox);
		return Msg.success();
	}
	
	
	@RequestMapping("/getMessageBoxByVideoId")
	@ResponseBody
	public Msg getMessageBoxByVideoId(@RequestParam Integer videoId){
		return Msg.success().add("messageBox", service.getMessageBoxByVideoId(videoId));
	}
	
	@RequestMapping("/deleteByMessageId")
	@ResponseBody
	public Msg deleteMessageBoxByMessageId(@RequestParam Integer messageId){
		service.deleteMessageBoxByMessageId(messageId);
		return Msg.success();
	}
}
