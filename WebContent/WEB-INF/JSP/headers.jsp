<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="nl">
<head>
<c:import url="/WEB-INF/JSP/head.jsp">
	<c:param name='title' value="Headers"/>
</c:import>
</head>
<body>
<c:import url='/WEB-INF/JSP/menu.jsp'/>
	<!-- Je browser: ${empty browser ? "onbekend" : browser} -->
	<dl>
		<c:forEach var="h" items="${headers}">
			<dt>${h.key}</dt><dd>${h.value}</dd>
		</c:forEach>
	</dl>
</body>
</html>