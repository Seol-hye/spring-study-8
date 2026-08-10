<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Quiz12 count 페이지</h1>

	<p>접속ID: ${id}</p>
	<p>접속횟수: ${count}회</p>

	<form action="/quiz12/logout" method="get">
		<button type="submit">로그아웃</button>
	</form>

	<c:choose>
		<c:when test="${empty id}">
			<p>익명의 사용자 접속중</p>
			<p>로그인 해주세요</p>
		</c:when>
		<c:otherwise>
			<p>${id} 님 환영합니다.</p>
		</c:otherwise>
	</c:choose>

</body>
</html>