<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/client/common/common.jspf" %>
	<script type="text/javascript">
		$(function(){
			$("#enterPwBtn").click(function(){
				$("#pwEnterForm").attr({
					"method" : "post",
					"action" : "/user/updateInfo"		
				});
				$("#pwEnterForm").submit();
			})
		})
	</script>
	</head>
	<body>
		<div class="container">
			<div class="logo">
				<img src="/resources/image/cultureLogo.jpg">
			</div>
			<form id="pwEnterForm">
				<input type="password" id="userPw" name="userPw" placeholder="비밀번호를 입력하세요">
				<button type="button" id="enterPwBtn" name="enterPwBtn">확인</button>
				<button type="button" id="cancelBtn" name="cancelBtn">취소</button>
			</form>

		</div>		
	</body>
</html>