<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<!-- 다 div 종류들 -->
	<header>
		<h1>Learn</h1>
		<div class="big_bt">
			<a href="#">Log in</a>
		</div>
	</header>
	<!-- 메뉴 : 꼭 nav안에 써야 하는 건 아님 -->
	<nav>
		<ul>
			<li><a href='#'>HTML5</a>
			<li><a href='#'>CSS</a>
			<li><a href='#'>JavaScript</a>
			<li><a href='#'>AJAX</a>
		</ul>
	</nav>
	<section>
		<!-- 왼쪽: 메뉴 -->
		<aside id="lside">
			<article>
				<ul>
					<li id="l1">Menu</li>
					<li><a href='#'>Intro</a></li>
					<li><a href='#'>Detail</a></li>
				</ul>
			</article>
		</aside>	
		<aside id="cside">
			<h1>Hello!</h1>
			<p>You can see the explanation about how to make a WEB.</p>
			<table id="tb1">
		<thead>
			<tr><th>header1</th><th>header2</th><th>header3</th></tr>
		</thead>
		<tbody>
			<tr><td>item1</td><td>item2</td><td>item3</td></tr>
			<tr><td>item1</td><td>item2</td><td>item3</td></tr>
			<tr><td>item1</td><td>item2</td><td>item3</td></tr>
			<tr><td>item1</td><td>item2</td><td>item3</td></tr>
			<tr><td>item1</td><td>item2</td><td>item3</td></tr>
		</tbody>
	</table>
		</aside>
		<aside id="rside">
			<p id = "ad">ADVERTISEMENT</p>
			<img src="http://via.placeholder.com/90x100">
		</aside>
	</section>
	<footer></footer>
</body>
</html>