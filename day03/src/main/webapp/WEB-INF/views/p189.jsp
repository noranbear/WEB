<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Lobster&display=swap" rel="stylesheet">
<style>
.big_bt{
	width: 150px;
	height: 70px;
	background-color: #FF6A00;
	border: 10px solid #FFFFFF;
	border-radius: 30px;
	box-shadow: 5px 5px 5px #A9A9A9; /*가로 세로 그림자길이*/
	
}
.big_bt > a{
	text-decoration: none; /*underline 없앰*/
	color: black;
	display: block;
	line-height: 70px; /*block 위아래 크기 조절*/
	text-align: center; /*이렇게만 쓰면 a는 인라인이기 때문에 변화가 없다 (이미 센터임)-블록으로 바꾸자*/
	font-size: 2em;
	font-weight: bold;
	font-family: 'Lobster', cursive;
}
.big_bt > a:hover{
	color: yellow;
}
.big_bt:hover{
	background: blue;
	border-radius: 10px solid black;
}
</style>
</head>
<body>
	<h1>P189</h1>
	<!-- 위의 .big_bt css만 있다면 어디든지 이렇게만 쓰면 버튼이 만들어짐 -->
	<div class="big_bt">
		<a href="#">Click</a>
	</div>
</body>
</html>