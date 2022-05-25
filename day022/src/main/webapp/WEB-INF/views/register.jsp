<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Register Page</h1>
	<form action="register" method="POST">
		<fieldset>
			<legend>Web 계정 만들기</legend>
			<input type="text" name="LN" placeholder="성">
			<input type="text" name="FN" placeholder="이름"><br>
			<input type="text" name="email" placeholder="이메일"><br>
			<input type="password" name="pwd" placeholder="비밀번호">
			<input type="password" name="pwd2" placeholder="확인">
			
			<input type="submit" value="Next">
		</fieldset>
	</form>
</body>
</html>