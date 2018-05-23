package com.chao.video.utils;

import java.util.HashMap;
import java.util.Map;

public class Msg {
	
	//code 用来表示状态，530表示失败  520表示成功
	private Integer code;
	// msg用来表示要传递的信息
	private String msg;
	// 使用map对象来保存要传递的对象
	private Map<String, Object> extend = new HashMap<String, Object>();
	
	public Msg add(String key, Object value){
		this.getExtend().put(key, value);
		return this;
	}
	public Msg setMessage(String msg){
		this.msg = msg;
		return this;
	}
	public static Msg success(){
		Msg msg = new Msg();
		msg.setCode(520);
		msg.setMsg("success");
		return msg;
	}
	
	public static Msg fail(){
		Msg msg = new Msg();
		msg.setCode(530);
		msg.setMsg("fail");
		return msg;
	}
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Map<String, Object> getExtend() {
		return extend;
	}
	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}
	
	
}
