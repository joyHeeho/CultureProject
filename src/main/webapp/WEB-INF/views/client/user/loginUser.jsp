<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/client/common/common.jspf" %>
	
	<script type="text/javascript">
		$(function(){
			$("#loginBtn").click(function(){
				$("#loginForm").attr({
					"method" : "post",
					"action" : "/user/login"
				});
				$("#loginForm").submit();
			});
			
			$("#logoutBtn").click(function(){
				location.href = "/user/logout"
			})
				
			
		})
	</script>

	</head>
	<body>
		<div class="container">
			<div class="logo">
				<img src="/resources/image/cultureLogo.jpg">
			</div>
			<div>
				<form id="loginForm">
					<div>
						<label>아이디</label>
						<input type="text" name="userId" id="userId">
					</div>
					<div>
						<label>비밀번호</label>
						<input type="password" name="userPw" id="userPw">
					</div>
					<button type="button" id="loginBtn" name="loginBtn">로그인</button>
					<button type="button" id="signUpBtn" name="signUpBtn">회원가입</button>
					<button type="button" id="logoutBtn" name="logoutBtn">로그아웃</button>
				</form>
			</div>
		</div>
	</body>
</html>