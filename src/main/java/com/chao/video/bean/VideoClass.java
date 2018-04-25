package com.chao.video.bean;

public class VideoClass {
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public VideoClass(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public VideoClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "VideoClass [id=" + id + ", name=" + name + "]";
	}
	
}
