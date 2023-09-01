package com.spring.user.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.user.login.service.UserService;
import com.spring.user.login.vo.UserVO;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Controller
@SessionAttributes("userLogin")
@RequestMapping("/user/*")
@Slf4j
public class UserController {
	
	@Setter(onMethod_ = @Autowired)
	public UserService userService;
	
	@GetMapping("/loginUser")
	public String login() {
		log.info("로그인 페이지 성공");
		return "client/user/loginUser";
	}
	
	@PostMapping("/login")
	public String loginForm(UserVO uvo, Model model, RedirectAttributes ras) {
		log.info("loginForm 메서드 성공");
		UserVO userLogin = userService.login(uvo);	//로그인 정보 세션에 담기, 로그인 메서드 + 쿼리 id = login 
		log.info(userLogin.toString());
		
		String url=null;
		
		if(userLogin != null) {
			model.addAttribute("userLogin", userLogin);
			log.info("로그인 성공");
			url = "redirect:/";
		} else {
			ras.addAttribute("msg", "로그인 실패");
			log.info("로그인 실패");
			url = "/client/user/loginUser";
		}
		return url;
	}
	
	@RequestMapping("/logout")
	   public String logout(SessionStatus sessionStatus) {
	      log.info("user 로그아웃 처리");
	      sessionStatus.setComplete();
	      return "redirect:/";
	   }
	
	@GetMapping("/signUpForm")
	public String signUpForm() {
		log.info("성공");
		return "client/user/signUpForm";
	}
	
	@PostMapping("/idChk")
	public String idChk(UserVO uvo) {
		log.info("idChk 실행");
		String id=uvo.getUserId();
		int idChk = userService.idChk(id);
		
		String result;
		
		if(idChk==0) {
			result = "사용할 수 있는 아이디입니다.";
		} else {
			result = "이미 존재하는 아이디입니다.";
		}
		log.info(result.toString());
		return result;

	}
	

	@GetMapping("findIdSelect")
	public String findIdSelect() {
		log.info("성공");
		return "client/user/findIdSelect";
	}
	
	@GetMapping("findIdEmailForm")
	public String findIdEmailForm() {
		log.info("성공");
		return "client/user/findIdEmailForm";
	}
	
	@GetMapping("findIdPhoneForm")
	public String findIdPhoneForm() {
		log.info("성공");
		return "client/user/findIdPhoneForm";
	}
	

	@GetMapping("findPwSelect")
	public String findPwSelect() {
		log.info("성공");
		return "client/user/findPwSelect";
	}
	
	@GetMapping("findPwEmailForm")
	public String findPwEmailForm() {
		log.info("성공");
		return "client/user/findPwEmailForm";
	}
	
	@GetMapping("findPwPhoneForm")
	public String findPwPhoneForm() {
		log.info("성공");
		return "client/user/findPwPhoneForm";
	}
	
	@GetMapping("myPage")
	public String myPage() {
		log.info("마이페이지 진입성공");
		return "client/user/myPage";
	}

	@GetMapping("enterPw")
	public String enterPw() {
		log.info("정보수정을 위한 비밀번호 입력");
		return "client/user/enterPw";
	}
	
	@PostMapping("updateInfo")
	public String updateInfo() {
		log.info("마이페이지 수정");
		return "client/user/updateInfo";
	}
	
	@GetMapping("myOrderList")
	public String myOrderList() {
		log.info("나의 예매내역 진입");
		return "client/user/myOrderList";
	}
	
	@GetMapping("deleteAccount")
	public String deleteAccount() {
		log.info("회원탈퇴");
		return "client/user/deleteAccount";
	}
}
