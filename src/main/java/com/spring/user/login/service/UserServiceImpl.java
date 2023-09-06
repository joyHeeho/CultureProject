package com.spring.user.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.user.login.dao.UserDAO;
import com.spring.user.login.vo.UserVO;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

	@Setter(onMethod_ = @Autowired)
	private UserDAO userDAO;

	@Override
	public UserVO login(UserVO uvo) {

		UserVO userVO = userDAO.login(uvo);
		log.info("" + uvo);
		return userVO;
	}

	@Override
	public int signUp(UserVO uvo) {
	
		return userDAO.signUp(uvo);
	}

	@Override
	public int idChk(UserVO uvo) {
		return userDAO.idChk(uvo);
	}

	@Override
	public int updateMyPage(UserVO uvo) {
		return userDAO.updateMyPage(uvo);
	}

	@Override
	public int pwChk(UserVO uvo) {
		int result = 0;
		result = userDAO.pwChk(uvo);
		return result;
	}

	@Override
	public UserVO myPage(UserVO uvo) {
		UserVO user = userDAO.myPage(uvo);
		return user;
	}

	
	
	
	
	

}
