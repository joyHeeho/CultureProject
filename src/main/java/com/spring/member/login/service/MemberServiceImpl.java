package com.spring.member.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.member.login.dao.MemberDAO;
import com.spring.member.login.vo.MemberVO;

import lombok.Setter;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Setter(onMethod_ = @Autowired)
	private MemberDAO memberDAO;

	/*로그인*/
	@Override
	public MemberVO login(MemberVO mvo) {
		return memberDAO.login(mvo);
	}

	/*회원가입 */
	@Override
	public MemberVO signUp(MemberVO mvo) {
		return memberDAO.signUp(mvo);
	}

	/*아이디 중복체크 */
	@Override
	public int idChk(MemberVO mvo) {
		return memberDAO.idChk(mvo);
	}
	

	

	

}
