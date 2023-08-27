package com.spring.member.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.member.login.service.MemberService;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Controller
//@SessionAttributes("memberLogin")
@RequestMapping("/member/*")
@Slf4j
public class MemberController {
	
	@Setter(onMethod_ = @Autowired )
	public MemberService memberService;
	
	@GetMapping("/login")
		public String loginForm() {
		return "client/member/login";
	}
	
	
}
