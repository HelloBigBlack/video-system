package com.chao.video.dao;

import org.apache.ibatis.annotations.Param;

import com.chao.video.bean.User;

public interface UserMapper {
	Integer selectUserCountByEmail(String emailId);
	Integer selectUserCountByEmailAndPassword(@Param("emailId")String emailId, @Param("password")String password);
	void insertUser(User user);
	User selectByEmail(String email);
}
