<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style> /*순서 중요*/ /**/
	/* *은 바디안에 있는 모든 것*/
	*{
		margin:0;	/*바깥쪽 여백*/
		/*padding:0;	/*안쪽 여백*/
	}
	h1{
		color:red;
		background:black;
	}
	
	/*id는 #으로 가져옴*/
	#hh1{	
		color:blue;
		background:yellow;
	}
	/*.은 class, 여러 타입애들에게 적용 가능*/
	.c1{
		color:green;
		background:pink;
	}
	/*자손, 후손 모두 선택*/
	a,p{
		color:blue;
	}
	/*마우스 대면 색 바뀜*/
	a:hover{
		color:white;
		background:black;
	}
	
</style>
</head>
<body>
	<h1>P105</h1>
	<h1 id="hh1">Header1</h1>	<!-- css에서 h1으로 스타일 지정하면 모든 h1애들이 다 걸리기 때문에 id를 만들어줌 -->
	<h1 class="c1">Header1</h1>
	<h2>Header2</h2>
	<h2 class="c1">Header2</h2>
	<a href="#">Click</a>
	<a href="#">Click</a>
	<span class="c1">Span1</span>
	<span>Span2</span>
	<p>Paragraph</p>
</body>
</html>