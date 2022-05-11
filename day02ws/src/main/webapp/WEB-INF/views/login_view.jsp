<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h1>LOGIN</h1>
	<form action="login" method="POST">
		<fieldset>
			<legend>Login</legend>
			<input type="text" name="id" placeholder="이메일 또는 휴대전화"><br>
			<input type="password" name="pwd" placeholder="비밀번호"><br>
			<input type="submit" value="Enter">
		</fieldset>
	</form>
</body>
</html>