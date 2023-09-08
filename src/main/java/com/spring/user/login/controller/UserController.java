package com.spring.user.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
		UserVO userLogin = userService.userLogin(uvo);	//로그인 정보 세션에 담기, 로그인 메서드 + 쿼리 id = login 
		log.info("userLogin" + userLogin);
		log.info("확인" +userLogin);
		String url=null;
		
		if (userLogin != null && userLogin.getUserDelete() != 1 ) {
			model.addAttribute("userLogin", userLogin);
			log.info("로그인 성공");
			url = "redirect:/";
		} else {
			ras.addAttribute("msg", "로그인 실패");
			log.info("로그인 실패");
			url = "redirect:/client/user/loginUser";
		}
		return url;
	}

	/*
	 * @PostMapping("/login") public String loginForm(UserVO uvo, Model model,
	 * RedirectAttributes ras) { log.info("loginForm 메서드 성공"); UserVO userLogin =
	 * userService.userLogin(uvo); // 로그인 정보 세션에 담기, 로그인 메서드 + 쿼리 id = login
	 * log.info("userLogin" + userLogin); log.info("확인" + userLogin); String url =
	 * null;
	 * 
	 * if (userLogin != null) { if (userLogin.getUserDelete() != 1) {
	 * model.addAttribute("userLogin", userLogin); log.info("로그인 성공"); url =
	 * "redirect:/"; } else { ras.addAttribute("msg", "계정이 삭제되었습니다.");
	 * log.info("계정이 삭제되었습니다."); url = "redirect:/client/user/loginUser"; } } else {
	 * ras.addAttribute("msg", "로그인 실패"); log.info("로그인 실패"); url =
	 * "redirect:/client/user/loginUser"; }
	 * 
	 * return url; }
	 */

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
	
	@ResponseBody
	@PostMapping("/idChk")
	public String idChk(String model, UserVO uvo) {
		log.info("idChk 실행");
		int idChk = userService.idChk(uvo);
		
		if(idChk==0) {
			model = "사용가능";
		} else {
			model = "불가능";
		}
		log.info(model.toString());
		return model;
	}
	
	@PostMapping("signUp")
	public String signUp(UserVO uvo) {
		log.info("회원가입폼전달완료");
		int result = userService.signUp(uvo);
		
		String url=null;
		
		if(result == 1) {
			url="/client/user/loginUser";
		} else {
			url="/client/user/signUpForm";
		}
		return url;
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
	
	@GetMapping("myPage1")
	public String myPage1() {
		log.info("수정된 마이페이지 진입성공");		
		return "client/user/myPage";	
	}
	
	@GetMapping("main")
	public String main() {
		log.info("메인페이지로 갈거야");
		return "redirect:/";
	}

	@GetMapping("enterPw")
	public String enterPw() {
		log.info("정보수정을 위한 비밀번호 입력");
		return "client/user/enterPw";
	}

	@ResponseBody
	@PostMapping("pwChk")
	public String pwdConfirm(String model, UserVO uvo) {
		log.info("pwChk 실행");
		int pwChk = userService.pwChk(uvo);
		log.info("id = " + uvo.getUserId());
		if(pwChk == 1) {
			model = "같다";
		} else {
			model = "다르다";
		}
		log.info(model.toString());
		return model;
		
	}
	
	//히든 때문에 ModelAttribute 써줬는데 쓸 필요가 없었네,,
	@PostMapping("updateMyPageForm")
	public String updateMyPageForm(/* @ModelAttribute UserVO uvo, Model model */UserVO uvo) {
		log.info("마이페이지 수정폼이다");
		log.info("userId = " + uvo.getUserId());
		//UserVO user = userService.myPage(uvo);
		//model.addAttribute("user", user);
		return "client/user/updateMyPage";
	}

	
	@PostMapping("updateMyPage") 
	public String updateMyPage(UserVO uvo, String model) { 
		log.info("마이페이지 수정폼을 넘기고 있다." + uvo.getUserId()); 
		int result = userService.updateMyPage(uvo);
		log.info("마이페이지 수정폼을 넘겼다 result : " + result);
		if(result == 1) {
			UserVO userLogin = userService.myPage(uvo);
			log.info("새로운 정보를 가져올 수 있을까 없을까? " + userLogin.toString());
			//return"/user/myPage";
			return "redirect:/";
		}else {
			model = "수정 실패";
			return model; 
		}
		
		
	}
	
	@GetMapping("enterPw2")
	public String enterPw2() {
		log.info("정보수정을 위한 비밀번호 입력");
		return "client/user/enterPw2";
	}
	
	@PostMapping("deleteAccount")
	public String deleteAccount(UserVO uvo, SessionStatus sessionStatus) {
		log.info("탈퇴쿼리문직전");
		int result = userService.deleteAccount(uvo);
		log.info("result : " + result);
		//log.info(uvo.getUserDelete());
		String url = null;
		if(result==1) {
			log.info("user 탈퇴성공");
			sessionStatus.setComplete();
		    url = "redirect:/";
		} else {
			log.info("user 탈퇴 실패");
			url = "client/user/enterPw2";
		}
		return url;
	}
	
	
	
	@GetMapping("myOrderList")
	public String myOrderList(UserVO uvo) {
		log.info("나의 예매내역 진입");
		return "client/user/myOrderList";
	}
	
	
}
