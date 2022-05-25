<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="user-scalable=no,initial-scale=1,maximum-scale=1">
<title>Insert title here</title>
<style>
	/*화면의 사이즈가 767 정도가 되면 밑의 css를 적용해라*/
	/*스마트폰 화면*/
	@media screen and (max-width: 767px){
		body{
			background: red;
		}
	}
	/*태블릿 화면*/
	@media screen and (min-width: 768px) and (max-width: 959px){
		body{
			background: green;
		}
	}
	/*전체화면*/
	@media screen and (min-width: 960px){
		body{
			background: blue;
		}
	}
</style>
</head>
<body>
	<h1>Media</h1>
	<p>I<br>
		On the top of the Crumpetty Tree<br>
		The Quangle Wangle sat,<br>
		But his face you could not see,<br>
		On account of his Beaver Hat.<br>
		For his Hat was a hundred and two feet wide,<br>
		With ribbons and bibbons on every side<br>
		And bells, and buttons, and loops, and lace,<br>
		So that nobody ever could see the face<br>
		Of the Quangle Wangle Quee.<br>
		
		II<br>
		The Quangle Wangle said<br>
		To himself on the Crumpetty Tree, —<br>
		"Jam; and jelly; and bread;<br>
		"Are the best of food for me!<br>
		"But the longer I live on this Crumpetty Tree<br>
		"The plainer than ever it seems to me<br>
		"That very few people come this way<br>
		"And that life on the whole is far from gay!"<br>
		Said the Quangle Wangle Quee.<br>
		</p>
</body>
</html>