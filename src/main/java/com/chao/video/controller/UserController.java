package com.chao.video.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chao.video.bean.User;
import com.chao.video.service.UserService;
import com.chao.video.utils.Msg;

@Controller
@RequestMapping("user")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping("/delete")
	@ResponseBody
	public Msg delete(@RequestParam String email){
		service.deleteUserByEmail(email);
		return Msg.success();
	}
	
	@RequestMapping("/register")
	@ResponseBody
	public Msg register(@RequestBody User user){
		if(service.emailIsUsed(user.getEmail())){
			return Msg.fail().setMessage("” œ‰“—±ª◊¢≤·");
		}
		service.register(user);
		return Msg.success();
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public Msg login(@RequestBody User user){
		System.out.println(user.getEmail() + "===" + user.getPassword());
		if(service.login(user.getEmail(), user.getPassword())){
			System.out.println(service.getUserInfoByEmail(user.getEmail()));
			return Msg.success().add("userInfo", service.getUserInfoByEmail(user.getEmail()));
		}else{
			return Msg.fail();
		}
	}
}
