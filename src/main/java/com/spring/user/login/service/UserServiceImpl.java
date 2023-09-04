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

	
	
	

}
