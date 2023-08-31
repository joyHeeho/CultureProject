package com.spring.member.login.dao;

import org.apache.ibatis.annotations.Mapper;

import com.spring.member.login.vo.MemberVO;

@Mapper
public interface MemberDAO {

	public MemberVO login(MemberVO mvo);
	public MemberVO signUp(MemberVO mvo);
	public int idChk(MemberVO mvo);
}
