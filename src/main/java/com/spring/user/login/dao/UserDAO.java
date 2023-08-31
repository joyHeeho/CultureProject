package com.spring.user.login.dao;

import org.apache.ibatis.annotations.Mapper;

import com.spring.user.login.vo.UserVO;

@Mapper
public interface UserDAO {
	public UserVO login(UserVO uvo);
}
