<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 폰트 선언 -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Koulen&family=Oleo+Script+Swash+Caps:wght@700&display=swap" rel="stylesheet">
<style>
*{
	margin: 0;
	padding: 0;
}
div{
	width: 200px;
	height: 200px;
	border: 3px dashed red;
	border-radius: 50px 50px 10px 10px; /*꺾이(모서리 다듬기)*/
	/*margin: 20px; /*4면 다*/
	/*margin: 20px 10px; /*x축 y축*/
	margin: 20px 10px 5px 50px; /*북 동 남 서*/
	padding: 10px;
}
/*p166 display 속성을 바꿔줌*/
p{
	/*display: inline; /*인라인으로 바꿔줌*/
	/*display: none; /*안 보이게 함*/
	/*visibility: hidden; /*display:none= 영역까지 없애줌, 이거=안보이게 하되 영역 유지*/
	display: inline-block; /*인라인임에도 가로세로 결정할 수있는 형태가 됨*/
	width: 100px;
	font-family: 'Koulen', cursive;
}
span{
	display: block;
	font-family: 'Oleo Script Swash Caps', cursive;
}
</style>
</head>
<body>
	<h1>P159</h1>
	<!-- div 눈에 보이지 않는 블럭/ 구역 나눌 때 씀 - 네이버 밑에 그 블로그 선택같은 거 만들 때 -->
	<div>
		<span>
			TEXT
		</span>
	</div>
	
	<br>
	<h1>P166</h1>
	<!-- 원래: span = 인라인 p= 블록-->
	<span>Span1</span><span>Span2</span>
	<p>Paragraph</p>
	<span>Span3</span><span>Span4</span>
</body>
</html>