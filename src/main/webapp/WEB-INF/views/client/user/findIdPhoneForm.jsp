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
					<label>이름</label>	
					<input type="text" id="userName" name="userName" placeholder="이름을 입력하세요"/>
				</div>
				<div>
					<label>생년월일</label>
					<input type="text" id="userBirth" name="userBirth" />
				</div>
				<div>
					<label>핸드폰번호</label>
					<input type="text" id="userPhone" name="userPhone"  placeholder="가입시 등록한 핸드폰번호를 입력하세요" />
				</div>
				<button type="button" id="findIdPnBtn" name="findIdPhBtn">확인</button>
				<button type="button" id="cancelBtn" name="cancelBtn">취소</button>
			</form>
		</div>
	</body>
</html>