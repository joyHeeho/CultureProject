<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/client/common/common.jspf" %>

<script type="text/javascript">
	$(function(){
		$("#chkId").click(function(){
			$("#id").attr({
				"method" : "post",
				"action" : "/member/chkId"
			})
			$("#id").submit();
			
		})
		
		$("#confirmBtn").click(function(){
			if(!chkData("#id", "아이디를")) return;
			else if(!chkData("#pw", "비밀번호를")) return;
			else { 
				$("#signUpForm").attr({
					"method" : "post",
					"action" : "/member/signUp"
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
			<form id="signUpForm">
				<div>
					<label>아이디</label>
					<input type="text" id="id" name="id" />
					<button type="button" id="chkId" name="chkId">아이디중복체크</button>
				</div>
				<div>
					<label>비밀번호</label>
					<input type="password" id="pw" name="pw" />
				</div>
				<div>
					<label>이메일</label>
					<input type="email" id="email" name="email" />
				</div>
				<div>
					<label>전화번호</label>
					<input type="text" id="phone" name="phone" />
				</div>
				<div>
					<label>생년월일</label>
					<input type="text" id="birth" name="birth" placeholder="000101형식으로 입력하세요" />
				</div>
				
				<button type="button" id="confirmBtn" name="confirmBtn">가입하기</button>
				<button type="button" id="cancelBtn" name="cancelBtn">취소</button>
			</form>
		</div>
	</body>
</html>
