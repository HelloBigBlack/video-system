package com.chao.video.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chao.video.bean.User;
import com.chao.video.dao.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper mapper;
	
	public boolean emailIsUsed(String emailId){
		return mapper.selectUserCountByEmail(emailId) == 1 ? true : false;
	}
	
	public boolean login(String emailId, String password){
		return mapper.selectUserCountByEmailAndPassword(emailId, password) == 1 ? true : false;
	}
	
	public void register(User user){
		mapper.insertUser(user);
	}
	
	public User getUserInfoByEmail(String email){
		return mapper.selectByEmail(email);
	}
	
	public void deleteUserByEmail(String email){
		mapper.deleteUserByEmail(email);
	}
}
