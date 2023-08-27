package com.spring.member.login.dao;

import com.spring.member.login.vo.MemberVO;

public interface MemberDAO {

	public MemberVO login(MemberVO mvo);
	public MemberVO signUp(MemberVO mvo);
}
