<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
	<form action="register" method="POST">
		<fieldset>
			<legend>Create Account</legend>
			<input type="text" name="id" placeholder="아이디"><br>
			<input type="password" name="pwd" placeholder="비밀번호"><br>
			Info<br>
			<input type="text" name="name" placeholder="이름"><br>
			Sex<br>
			<input type="radio" name="sex" value="f">Female<br>
			<input type="radio" name="sex" value="m">Male<br>
			Contact<br>
			<input type="text" name="PN" placeholder="전화번호"><br>
			<input type="text" name="email" placeholder="이메일"><br>
			<input type="submit" value="Enter">
		</fieldset>
	</form>
	
</body>
</html>