<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Quiz07 listTest 페이지</h1>

	<c:choose>
		<c:when test="${type == 'str'}">
			<c:forEach var="str" items="${list}">
				<p>${str}</p>
			</c:forEach>
		</c:when>

		<c:when test="${type == 'member'}">
			<c:forEach var="member" items="${mlist}">
				<p>${member.id} ${member.pw} ${member.name}</p>
			</c:forEach>
		</c:when>
	</c:choose>

</body>
</html>