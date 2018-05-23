package com.chao.video.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chao.video.bean.AdminUser;
import com.chao.video.service.AdminUserService;
import com.chao.video.utils.Msg;

@Controller
@RequestMapping("admin")
@CrossOrigin("*")
public class AdminController {

	@Autowired
	AdminUserService userService;
	

	//π‹¿Ì‘±µ«¬º
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public Msg login(AdminUser user){
		System.out.println(user);
		if(userService.login(user)){
			return Msg.success().add("user", user);
		}else{
			return new Msg();
		}
	}
}
