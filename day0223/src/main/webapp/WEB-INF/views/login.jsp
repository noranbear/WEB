<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Page</h1>
	<form action="login" method="POST">
		<fieldset>
			<legend>Web 계정 만들기</legend>
			<input type="text" name="id" placeholder="이메일 또는 휴대전화"><br>
			<input type="password" name="pwd" placeholder="비밀번호"><br>
			<input type="submit" value="Next">
		</fieldset>
	</form>
</body>
</html>