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
		
		log.info(" login 로그인 성공");
	}
	
	@Test
	public void idChkTest() {
		UserVO uvo = new UserVO();
		
		uvo.setUserId("u0");
		
		int result = userDAO.idChk(uvo);
		
		log.info("idChkTest result : " + result);
	}


   @Test 
   public void insertTest() { 
	   UserVO uvo = new UserVO();
			uvo.setUserId("user1tw4r"); 
			uvo.setUserPw("Wpqkfehldjwnj!1");
			uvo.setUserEmail("kim21670@naver.com"); 
			uvo.setUserPhone("01021212121");
			uvo.setUserBirth("990909"); 
			uvo.setUserName("테스트we3"); 
			
			int result = userDAO.signUp(uvo);
			  
			log.info("insertTest result : " + result);
   }


   @Test
   	public void pwChk() { 
	   UserVO uvo = new UserVO();

	   uvo.setUserId("u4r123456"); 
	   uvo.setUserPw("Wpreeetldjwnj!1");
 
	   int result = userDAO.pwChk(uvo);
	   log.info("pwChk result : " + result); }

   @Test
   public void myPage() {
	   UserVO uvo = new UserVO();
	   
	   uvo.setUserId("u1");
	   
	   UserVO result = userDAO.myPage(uvo);
	   log.info("myPage result : " + result + uvo.toString());
   }
	
	@Test 
	public void updateMyPage() { 
		UserVO uvo = new UserVO();
		
		uvo.setUserId("u0");
		uvo.setUserPw("u000");
		uvo.setUserEmail("user13443435");
		uvo.setUserPhone("00043000");
		
		int result = userDAO.updateMyPage(uvo);
		log.info("updateMyPage result : " + result);
		}
	*/
	
	@Test
	public void deleteAccount() {
		UserVO uvo = new UserVO();
		
		uvo.setUserId("u0");
		uvo.setUserPw("u000");
		
		int result = userDAO.deleteAccount(uvo);
		log.info("deleteAccount result : " + result + uvo.toString());

	}
	
}
