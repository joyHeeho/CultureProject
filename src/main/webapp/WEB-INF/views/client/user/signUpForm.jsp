<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/client/common/common.jspf" %>
	
	<script type="text/javascript">
	$(function(){
		$("#idChk").click(function(){
			$("#userId").attr({
				"method" : "post",
				"action" : "/user/idChk"
			})
		})
		
		$("#confirmBtn").click(function(){
			if(!chkData("#userName", "아이디를")) return;
			else if(!chkData("#userId", "비밀번호를")) return;
			else if(!chkData("#userPw", "비밀번호를")) return;
			else if(!chkData("#userEmail", "비밀번호를")) return;
			else if(!chkData("#userPhone", "비밀번호를")) return;
			else if(!chkData("#userBirth", "비밀번호를")) return;
			else { 
				$("#signUpForm").attr({
					"method" : "post",
					"action" : "/user/signUp"
				})
				$("#signUpForm").submit();
			}	
		})
		$("#cancelBtn").click(function(){
			$("#signUpForm").each(function(){
				this.reset();  
			  });
		})
		
		
	})
	</script>




	</head>
	<body>
		<div class="container">
			<div class="logo">
				<img src="/resources/image/cultureLogo.jpg">
			</div>
			<form id="signUpForm">
				<div>
					<label>이름</label>
					<input type="text" id="userName" name="userName" placeholder="이름을 입력해 주세요."/>
				</div>
				<div>
					<label>아이디</label>
					<input type="text" id="userId" name="userId" placeholder="아이디를 입력해 주세요."/>
					<button type="button" id="idChk" name="idChk">아이디중복체크</button>
				</div>
				<div>
					<label>비밀번호</label>
					<input type="password" id="userPw" name="userPw" placeholder="비밀번호를 입력해 주세요." />
					<p></p>
				</div>
				<div>
					<label>이메일</label>
					<input type="email" id="userEmail" name="userEmail" />
					<button type="button" id="emailChk" name="emailChk">이메일 인증</button>
				</div>
				<div>
					<label>전화번호</label>
					<input type="text" id="userPhone" name="userPhone"/>
					<button type="button" id="phoneChk" name="phoneChk">이메일 인증</button>
				</div>
				<div>
					<label>생년월일</label>
					<input type="text" id="birth" name="birth" placeholder="000101형식으로 입력하세요" />
				</div>
				
				<button type="button" id="confirmBtn" name="confirmBtn">회원가입</button>
				<button type="button" id="cancelBtn" name="cancelBtn">취소</button>
			</form>
		</div>
	</body>
</html>