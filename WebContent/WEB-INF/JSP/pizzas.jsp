<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"
	session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="nl">
<head>
<meta charset="UTF-8">
<title>Pizza's</title>
<link rel='icon' href='images/favicon.ico'>
<meta name='viewport' content='width=device-width,initial-scale=1'>
<link rel='stylesheet' href='styles/default.css'>
</head>
<body>
	<h1>Pizza's</h1>
	<c:forEach var="pizza" items="${pizzas}">
		<ul class="zebra">
			<li>${pizza.naam} ${pizza.prijs}&euro;</li>
		</ul>
	</c:forEach>
</body>
</html>