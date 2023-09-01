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
					<label>변경불가</label>				
				</div>
				<div>
					<label>아이디</label>
					<label>변경불가</label>
				</div>
				<div>
					<label>이메일</label>
					<input type="email" id="userEmail" name="userEmail" />
				</div>
				<div>
					<label>전화번호</label>
					<input type="text" id="userPhone" name="userPhone" />
				</div>
				<div>
					<label>생년월일</label>
					<label>변경불가</label>
				</div>
				<button type="button" id="updateInfoBtn" name="updateInfoBtn">수정 완료</button>
				<button type="button" id="cancelBtn" name="cancelBtn">메인페이지로</button>
			</form>
		</div>
	</body>
</html>