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
/*	
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
		
		uvo.setUserId("user1234");
		
		int result = userDAO.idChk(uvo);
		
		log.info("result : " + result);
	}
*/
/*
 * @Test public void insertTest() { UserVO uvo = new UserVO();
 * 
 * uvo.setUserId("user123456"); uvo.setUserPw("Wpqkfehldjwnj!1");
 * uvo.setUserEmail("kim21670@naver.com"); uvo.setUserPhone("01021212121");
 * uvo.setUserBirth("990909"); uvo.setUserDate("sysdate");
 * uvo.setUserName("헤헤"); int result = userDAO.signUp(uvo);
 * 
 * log.info("result : " + result);
 * 
 * }
 */
/*
 * @Test public void pwChk() { UserVO uvo = new UserVO();
 * 
 * uvo.setUserId("user123456"); uvo.setUserPw("Wpqkfehldjwnj!1");
 * 
 * int result = userDAO.pwChk(uvo);
 * 
 * log.info("result : " + result); }
 */
	
	@Test 
	public void updateMyPage() { 
		UserVO uvo = new UserVO();
		
		uvo.setUserId("u0");
		uvo.setUserPw("u000");
		uvo.setUserEmail("user123456");
		uvo.setUserPhone("000000");
		
		int result = userDAO.updateMyPage(uvo);
		log.info("result : " + result);
		}
		
	
}
