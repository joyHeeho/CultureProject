package com.spring.user.login.service;

import com.spring.user.login.vo.UserVO;

public interface UserService {

	public UserVO login(UserVO uvo);
	public int signUp(UserVO uvo);
	public int idChk(UserVO uvo);
}
