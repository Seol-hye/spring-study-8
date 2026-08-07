<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Quiz10 A 페이지</h1>
	
	<p>${requestScope.fromA}</p>
	<p>${requestScope.originalA}</p>
	<%-- <p>${sessionScope.fromB}</p> jsp 기준 주석--%>
	<!-- html 기준 주석 -->
	<p>${fromB}</p>
</body>
</html>