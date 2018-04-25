package com.chao.video.bean;

public class User {
	private String email;
	private String name;
	private String sex;
	private String password;
	private String register;
	private String noMessage;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getNoMessage() {
		return noMessage;
	}
	public void setNoMessage(String noMessage) {
		this.noMessage = noMessage;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + name + ", sex=" + sex + ", password=" + password + ", register="
				+ register + ", noMessage=" + noMessage + "]";
	}
	
}
