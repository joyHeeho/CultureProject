package com.spring.user.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.user.login.dao.UserDAO;
import com.spring.user.login.vo.UserVO;

import lombok.Setter;

@Service
public class UserServiceImpl implements UserService {

	@Setter(onMethod_ = @Autowired)
	private UserDAO userDAO;

	@Override
	public UserVO login(UserVO uvo) {
		return userDAO.login(uvo);
	}
	
	

}
