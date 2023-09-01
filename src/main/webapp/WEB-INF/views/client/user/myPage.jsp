<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/client/common/common.jspf" %>
	<script type="text/javascript">
		$(function(){
			$("#updateInfoBtn").click(function(){
				location.href="/user/enterPw";
			})
			$("#deleteAccountBtn").click(function(){
				location.href="/user/deleteAccount";
			})
			$("#mainPageBtn").click(function(){
				location.href="";
			})
			$("#myOrderListBtn").click(function(){
				location.href="/user/myOrderList";
			})
		})
	</script>
	</head>
	<body>
		<div class="container">
			<div class="logo">
				<img src="/resources/image/cultureLogo.jpg">
			</div>
			<form>
				<div>
					<label>이름</label>
					<label></label>				
				</div>
				<div>
					<label>아이디</label>
					<label></label>
				</div>
				<div>
					<label>이메일</label>
					<label></label>
				</div>
				<div>
					<label>전화번호</label>
					<label></label>
				</div>
				<div>
					<label>생년월일</label>
					<label></label>
				</div>
				<div>
					<label>가입일</label>
					<label></label>
				</div>
				<button type="button" id="updateInfoBtn" name="updateInfoBtn">정보 수정</button>
				<button type="button" id="mainPageBtn" name="mainPageBtn">메인페이지로</button>
				<button type="button" id="deleteAccountBtn" name="deleteAccountBtn">회원탈퇴</button>
				<button type="button" id="myOrderListBtn" name="myOrderListBtn">나의 예매내역</button>
			</form>
		</div>
	</body>
</html>