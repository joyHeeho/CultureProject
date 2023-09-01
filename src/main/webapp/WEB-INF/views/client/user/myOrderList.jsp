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
				<h1>나의 예매내역</h1>
				<div>
					<label>예매번호</label>
					<label>000221200</label>
				</div>
				<div>
					<label>제목</label>
					<label>문화빛길</label>					
				</div>
				<div>
					<label>상영장소</label>
					<label>KH정보교육원 4층 5관</label>
				</div>
				<div>
					<label>상영일시</label>
					<label>2023-09-26 15:00</label>
				</div>
				<div>
					<label>좌석(인원수)</label>
					<label>J1, J2(성인 2명)</label>
				</div>
				<button type="button" id="enterBtn" name="enterBtn">확인</button>
				<button type="button" id="orderCancelBtn" name="orderCancelBtn">예매 취소</button>
			</form>
		</div>
	</body>
</html>