package com.chao.video.utils;

import java.util.HashMap;
import java.util.Map;

public class Msg {
	
	//530Ê§°Ü  520³É¹¦
	private Integer code;
	private String msg;
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
