<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Main Page</h1>
	<h2>${w}</h2> <!-- taglib 위에 적어야 함 -->
	<h3><a href="register_view">REGISTER</a></h3>
	<h3><a href="login_view">LOGIN</a></h3>	 <!-- login을 클릭하면 login 프로그램 동작 -->
</body>
</html>