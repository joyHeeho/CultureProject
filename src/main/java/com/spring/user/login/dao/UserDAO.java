package com.spring.user.login.dao;

import org.apache.ibatis.annotations.Mapper;

import com.spring.user.login.vo.UserVO;

@Mapper
public interface UserDAO {
	public UserVO login(UserVO uvo);
	public int signUp(UserVO uvo);
	public int idChk(UserVO uvo);
	public int updateMyPage(UserVO uvo);
	public int pwChk(UserVO uvo);
	public UserVO myPage(UserVO uvo);
}
