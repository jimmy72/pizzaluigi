<%@ page contentType="text/html" pageEncoding="UTF-8" session="false"
	trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="nl">
<head>
<c:import url="/WEB-INF/JSP/head.jsp">
	<c:param name="title" value="Statistieken" />
</c:import>
</head>
<body>
	<c:import url="/WEB-INF/JSP/menu.jsp" />
	<h1>Statistiek</h1>
	<dl>
		<dt>Welkom pagina aantal keren bekeken:</dt>
		<dd>${indexRequests}</dd>
		<dt>Pizzas pagina aantal keren bekeken:</dt>
		<dd>${pizzasRequests}</dd>
	</dl>
</body>
</html>