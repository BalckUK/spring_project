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
	<c:forEach var="i" items="${list}">
		${i.seq} : ${i.writer} : ${i.message}<br>
	</c:forEach>
	<form action="del" method="get">
		<input type="text" placeholder="삭제하고 싶은 번호를 적으세요" name="seq"> <input
			type="submit" value="삭제">
	</form>
</body>
</html>