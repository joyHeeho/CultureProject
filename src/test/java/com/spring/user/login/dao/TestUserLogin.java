package com.spring.user.login.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.user.login.vo.UserVO;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class TestUserLogin {
	
	@Setter(onMethod_ = @Autowired)
	private UserDAO userDAO;
	
	@Test
	public void login() {
		UserVO uvo = new UserVO();
		
		uvo.setUserId("u0");
		uvo.setUserPw("u0");
		
		log.info("로그인 성공");
	}
	

	@Test
	public void idChkTest() {
		UserVO uvo = new UserVO();
		
		uvo.setUserId("user123");
		
		int result = userDAO.idChk(uvo);
		
		log.info("result : " + result);
	}


}
