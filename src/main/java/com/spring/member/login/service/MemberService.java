package com.spring.member.login.service;

import com.spring.member.login.vo.MemberVO;

public interface MemberService {
	public MemberVO login(MemberVO mvo);
	public MemberVO signUp(MemberVO mvo);
}
