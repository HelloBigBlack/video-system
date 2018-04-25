package com.chao.video.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chao.video.bean.AdminUser;
import com.chao.video.dao.AdminUserMapper;

@Service
public class AdminUserService {
	
	@Autowired
	private AdminUserMapper mapper;
	
	public boolean login(AdminUser user){
		return mapper.selectUserCount(user) == 1 ? true : false;
	}
}
