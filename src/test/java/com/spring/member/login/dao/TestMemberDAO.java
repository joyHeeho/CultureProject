package com.spring.member.login.dao;

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
	
	public void loginTest() {
		MemberVO mvo = new MemberVO();
		
		mvo.setId("user01");
		mvo.setPw("pass01");
	
		log.info(memberDAO.login(mvo).toString());
	}
	
	
	

}
