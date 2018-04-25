package com.chao.video.bean;

public class MessageBox {
	private String messageId;
	private String videoId;
	private String userId;
	private String messageText;
	private String timestep;
	private String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getVideoId() {
		return videoId;
	}
	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMessageText() {
		return messageText;
	}
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}
	public String getTimestep() {
		return timestep;
	}
	public void setTimestep(String timestep) {
		this.timestep = timestep;
	}
	@Override
	public String toString() {
		return "MessageBox [messageId=" + messageId + ", videoId=" + videoId + ", userId=" + userId + ", messageText="
				+ messageText + ", timestep=" + timestep + "]";
	}
	
	
}
