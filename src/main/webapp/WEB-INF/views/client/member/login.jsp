<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/client/common/common.jspf" %>
	<script type="text/javascript">
		$(function(){
			$("#loginBtn").click(function(){
				$("#loginForm").attr({
					"method" : "post",
					"action" : "/main"
				})
				$("#loginForm").submit();
			});
			
			$("#signUpBtn").click(function(){
				location.href="/client/member/signUpForm";
			});
		})
		
	</script>
	
	</head>
	<body>
		<div class="logo">
			<img src="/resources/image/cultureLogo">
		</div>
		<div>
			<form id="loginForm" name="loginForm">
				<label>아이디</label>
				<input type="text" name="id" id="id" />
				<label>비밀번호</label>
				<input type="password" name="pw" id="pw" />
				<button type="button" id="loginBtn" name="loginBtn" >로그인</button>
				<button type="button" id="signUpBtn" name="signUpBtn">회원가입</button>
			</form>
		</div>
	</body>
</html>