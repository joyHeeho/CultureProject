package com.spring.member.login.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.member.login.vo.MemberVO;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class TestMemberDAO {
	
	@Setter(onMethod_ = @Autowired)
	private MemberDAO memberDAO;
	/*
	@Test
	public void loginTest() {
		MemberVO mvo = new MemberVO();
		
		mvo.setId("member1234");
		mvo.setPw("mem1234");
	
		log.info(memberDAO.login(mvo).toString());
	}
	*/
	@Test
	public void idChkTest() {
		MemberVO mvo = new MemberVO();
		
		mvo.setId("member1234");
		
		int result = memberDAO.idChk(mvo);
		
		log.info("result : " + result);
	}

	
	
	

}
