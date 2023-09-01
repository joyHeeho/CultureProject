<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/client/common/common.jspf" %>
	</head>
	<body>
		<div class="container">
			<div class="logo">
				<img src="/resources/image/cultureLogo.jpg">
			</div>
			<form>
				<div>
					<label>아이디</label>	
					<input type="text" id="userId" name="userId" placeholder="아이디를 입력하세요"/>
				</div>
				<div>
					<label>생년월일</label>
					<input type="text" id="userBirth" name="userBirth" />
				</div>
				<div>
					<label>이메일</label>
					<input type="text" id="userEmail" name="userEmail"  placeholder="가입시 등록한 이메일을 입력하세요" />
				</div>
				<button type="button" id="findPwEmBtn" name="findPwEmBtn">확인</button>
				<button type="button" id="cancelBtn" name="cancelBtn">취소</button>
			</form>
		</div>
	</body>
</html>