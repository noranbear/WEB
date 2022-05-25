<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.box{
	width: 100px;
	height: 100px;
	position: absolute; /*절대적 위치 ㄱ 세 개가 겹쳐짐, position= 잘 안 씀*/
	opacity: 0.7;
	/*float: left; /*block 속성인데도 가로 정렬 가능*/
	/*float: right; /*오른쪽부터 시작해서 정렬*/
	
}
.box:nth-child(1) {
	background-color: red;
	left: 10px;
	top: 10px;
	z-index: 100; /*겹쳤을 때 먼저 보이는 거 숫자 높을 수록 위에 보임*/
}
.box:nth-child(2) {
	background-color: blue;
	left: 50px;
	top: 50px;
	z-index: 10;
}
.box:nth-child(3) {
	background-color: green;
	left: 90px;
	top: 90px;
	z-index: 20;
}
</style>
</head>
<body>
	<div class="box"></div>
	<div class="box"></div>
	<div class="box"></div>
</body>
</html>