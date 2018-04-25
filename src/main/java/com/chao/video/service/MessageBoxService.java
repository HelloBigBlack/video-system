package com.chao.video.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chao.video.bean.MessageBox;
import com.chao.video.dao.MessageBoxMapper;

@Service
public class MessageBoxService {
	
	@Autowired
	private MessageBoxMapper mapper;
	
	public List<MessageBox> getMessageBoxByVideoId(Integer videoId){
		return mapper.getMessageBoxByVideoId(videoId);
	}
	
	public void deleteMessageBoxByMessageId(Integer messageId){
		mapper.deleteMessageBoxByMessageId(messageId);
	}
	
	public void addMessageBox(MessageBox messageBox){
		mapper.insertMessageBox(messageBox);
	}
	
}
