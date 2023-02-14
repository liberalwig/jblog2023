<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 메타태그 -->
<!--  
<meta name="viewport" content="width=device-width, initial-scale=1">
-->

<!-- css -->
<link href="${pageContext.request.contextPath}/assets/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/jblog.css">

<!-- 자바스크립트 -->
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery/jquery-1.12.4.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/bootstrap/js/bootstrap.js"></script>

<title>JBlog</title>

</head>
<body>
	<div id="center-content">

		<!-- 메인 해더 -->
		<c:import url="/WEB-INF/views/includes/main-header.jsp"></c:import>

		<div>
			<form id="joinForm" method="post" action="${pageContext.request.contextPath}/member/join">
				<table>
					<colgroup>
						<col style="width: 100px;">
						<col style="width: 170px;">
						<col style="">
					</colgroup>
					<tr>
						<td><label for="txtId">아이디</label></td>
						<td><input id="txtId" type="text" name="id" value=""></td>
						<td><button id="btnIdCheck" type="button">아이디체크</button></td>
					</tr>
					<tr>
						<td></td>
						
						<td id="tdMsg" colspan="2"><div id="msg"></div></td>
					</tr>
					<tr>
						<td><label for="txtPassword">패스워드</label></td>
						<td><input id="txtPassword" type="password" name="password" value=""></td>
						<td></td>
					</tr>
					<tr>
						<td><label for="txtUserName">이름</label></td>
						<td><input id="txtUserName" type="text" name="userName" value=""></td>
						<td></td>
					</tr>
					<tr>
						<td><span>약관동의</span></td>
						<td colspan="3"><input id="chkAgree" type="checkbox" name="agree" value="y"> <label for="chkAgree">서비스 약관에 동의합니다.</label></td>
					</tr>
				</table>
				<div id="btnArea">
					<button id="btnJoin" class="btn" type="submit">회원가입</button>
				</div>

			</form>

		</div>


		<!-- 메인 푸터  자리-->
		<c:import url="/WEB-INF/views/includes/main-footer.jsp"></c:import>
	</div>

</body>
<script type="text/javascript">
	//중복체크를 클릭할때
	$("#btnIdCheck").on("click", function(){
		console.log("클릭");
		var id = $("#txtId").val();
		var userVo = {
			id : id
		}
		$.ajax({
			url : "${pageContext.request.contextPath}/user/idCheck",
			type : "post",
			data : userVo,

			//응답받을때
			success : function(result) {
				if (result == 'success') {//중복 없음
					var str = "";
					str += '사용할 수 있는 아이디 입니다.';
					$("#msg").html(str);
				} else {//중복 있음
					var str = "";
					str += '다른 아이디로 가입해 주세요.';
					$("#msg").html(str);
				}
			},
			error : function(XHR, status, error) {
				console.error(status + " : " + error);
			}
		});
	});
	
	//회원가입 버튼을 클릭할때
	$("#btnJoin").on("click", function() {
		console.log("click");
		var id = $("#txtId").val();
		var pw = $("#txtPassword").val();
		var	userName = $("#txtUserName").val();
		console.log(id);
		console.log(pw);
		console.log(userName);
		if (id == '') {
			alert("아이디를 입력해주세요");
			return false;//하던일을 멈춤, 없으면 하던일을 함
		} 
		if (pw == '') {
			alert("패스워드를 입력해주세요");
			return false;
		}
		if (userName == '') {
			alert("이름을 입력해주세요");
			return false;
		}
	});
</script>

</html>