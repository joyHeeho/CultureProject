package com.spring.user.login.service;

import com.spring.user.login.vo.UserVO;

public interface UserService {

	public UserVO userLogin(UserVO uvo);
	public int signUp(UserVO uvo);
	public int idChk(UserVO uvo);
	public int updateMyPage(UserVO uvo);
	public int pwChk(UserVO uvo);
	public UserVO myPage(UserVO uvo);
	public int deleteAccount(UserVO uvo);
}
