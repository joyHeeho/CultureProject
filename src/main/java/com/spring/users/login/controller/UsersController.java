package com.spring.member.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.member.login.service.MemberService;
import com.spring.member.login.vo.MemberVO;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Controller
@SessionAttributes("memberLogin")
@RequestMapping("/member/*")
@Slf4j
public class MemberController {
	
	@Setter(onMethod_ = @Autowired )
	public MemberService memberService;
	
	@GetMapping("/login")
		public String loginForm() {
	
		log.info("성공");
		return "client/member/login";
	}
	
	@PostMapping("/login")
	   public String loginForm(MemberVO mvo, Model model, RedirectAttributes ras) {
	      log.info("loginForm 메서드 성공");
	      MemberVO memberLogin = memberService.login(mvo);
	      
	      String url=null;
	      
	      if(memberLogin != null ) {
	         model.addAttribute("memberLogin", memberLogin);
	         url = "redirect:/";
	      } else {
	         ras.addAttribute("msg", "로그인실패");
	         url = "/client/member/login";
	      }
	      return url ;
	   }
	
	@GetMapping("signUpForm")
	public String signUpForm() {
		log.info("성공");
		return "client/member/signUpForm";
	}
	
	@GetMapping("idChk")
	public String idChk(MemberVO mvo) {
		int id = memberService.idChk(mvo);
		
		String result;
		
		if(id==0) {
			result = "사용할 수 있는 아이디입니다.";
		} else {
			result = "이미 존재하는 아이디입니다.";
		}
		return result;
	}
	
	
}
