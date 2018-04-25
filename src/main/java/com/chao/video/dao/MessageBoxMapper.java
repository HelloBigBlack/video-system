package com.chao.video.dao;

import java.util.List;

import com.chao.video.bean.MessageBox;

public interface MessageBoxMapper {
	List<MessageBox> getMessageBoxByVideoId(Integer videoId);
	
	void deleteMessageBoxByMessageId(Integer messageId);
	
	void insertMessageBox(MessageBox messageBox);
}
