<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	/*id를 지정하지 않고도 속성으로 스타일 지정*/
	input[type="text"]{
		background:pink;
	}
	input[name="pwd"]{
		background:yellow;
	}
	input[type="submit"]:hover{
		color:white;
		background:black;
	}
	/*p142*/
	/*input 태그에 focus가 일어나면*/
	input:focus{
		background:blue;
	}
	
</style>
</head>
<body>
	<h1>P135</h1>
	<form>
		ID<input type="text" name="id"><span>Mandatory</span><br>
		ID<input type="password" name="pwd"><span>Mandatory</span><br>
		ID<input type="submit" name="login"><span>Mandatory</span><br>
	</form>
</body>
</html>