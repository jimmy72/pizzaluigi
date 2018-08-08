<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="nl">
<head>
<c:import url="/WEB-INF/JSP/head.jsp">
	<c:param name='title' value="Identificatie" />
</c:import>
</head>
<body>
	<c:import url="/WEB-INF/JSP/menu.jsp" />
	<form method="post" action="<c:url value='/identificatie.htm'></c:url>">
		<label>Naam<input name="gebruikersnaam"	type="text" value="${gebruikersnaam}" autofocus>
		</label>
		<input type="submit" value="Onthoud me">
	</form>
</body>
</html>