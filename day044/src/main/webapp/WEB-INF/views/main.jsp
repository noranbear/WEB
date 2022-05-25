<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/main.css">
<style>
</style>
</head>
<body>
	<!-- 다 div 종류들 -->
	<header>
		<h1><a href="/">HTML5 & CSS3.0</a></h1>
	</header>
	<!-- 메뉴 : 꼭 nav안에 써야 하는 건 아님 -->
	<nav>
		<ul>
			<li><a href="html5">HTML5</a>
			<li><a href="css3">CSS3</a>
			<li><a href="js">JavaScript</a>
			<li><a href="media">Media</a>
		</ul>
	</nav>
	<section>
		<jsp:include page="${center}.jsp"></jsp:include>
	</section>
	<footer></footer>
</body>
</html>