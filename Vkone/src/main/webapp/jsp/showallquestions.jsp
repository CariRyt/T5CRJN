<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kaikki kysymykset</title>
</head>
<body>

<table>
<tr>
	<th>Kysymys_ID</th>
	<th>Kysymys</th>
	
</tr>
<c:forEach var="question" items="${requestScope.kysymyslista }">
	<tr>
		<td>${question.kysymysId }</td>
		<td>${question.kysymys }</td>
		
	</tr>
</c:forEach>
</table>

</body>
</html>