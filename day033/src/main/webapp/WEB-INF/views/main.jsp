<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
/*  Global CSS starts -------------------------------------------------*/
*{
	margin: 0;
	padding: 0;
}
a{
	text-decoration: none;
	color: black;
}
ul,ol{
	list-style: none;
}
/*  Global CSS ends -------------------------------------------------*/

/*  Header CSS starts -------------------------------------------------*/
header{
	width: 600px;
	height: 100px;
	background: red;
	margin: 0 auto; /*x y(정가운데-화면이 줄어들든 커지든(반응형))*/
}
header > h1{
	text-align: center;
	line-height: 100px;
}
/*  Header CSS ends -------------------------------------------------*/

/*  Nav CSS starts -------------------------------------------------*/
nav{
	width: 600px;
	height: 30px;
	background: pink;
	margin: 0 auto; 
}
nav > ul{
	width: 500px;
	margin: 0 auto;
}
nav > ul > li{
	float: left;
	width: 125px;
	line-height: 30px;
}
nav > ul > li > a{
	display: block;
	text-align: center;
}
/*  Nav CSS ends -------------------------------------------------*/

/*  Section CSS starts -------------------------------------------------*/
section{
	width: 600px;
	height: 500px;
	background: grey;
	margin: 0 auto; 
}
section > aside{
	float: left;
}
section > #lside{
	width: 100px;
	height: 500px;
	background: yellow;
}
section > #cside{
	width: 400px;
	height: 500px;
	background: white;
}
section > #rside{
	width: 100px;
	height: 500px;
	background: grey;
}
/*  Section CSS ends -------------------------------------------------*/

/*  Footer CSS starts -------------------------------------------------*/
footer{
	width: 600px;
	height: 30px;
	background: black;
	margin: 0 auto; 
}
/*  Footer CSS ends -------------------------------------------------*/
</style>
</head>
<body>
	<!-- 다 div 종류들 -->
	<header>
		<h1>HTML5 & CSS3.0</h1>
	</header>
	<!-- 메뉴 : 꼭 nav안에 써야 하는 건 아님 -->
	<nav>
		<ul>
			<li><a href="">HTML5</a>
			<li><a href="">HTML5</a>
			<li><a href="">JavaScript</a>
			<li><a href="">AJAX</a>
		</ul>
	</nav>
	<!-- 왼쪽 메뉴,  -->
	<section>
		<aside id="lside"></aside>
		<aside id="cside"></aside>
		<aside id="rside"></aside>
	</section>
	<footer></footer>
</body>
</html>