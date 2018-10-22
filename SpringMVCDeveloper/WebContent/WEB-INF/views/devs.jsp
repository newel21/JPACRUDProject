<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Developer Details</title>
<style>
	.wrapper{
		margin: auto;
		background: #eee;
		display:grid;
		border: solid;
		padding: 5em;
	}
</style>
</head>
<body>
	<div class="wrapper">
	<form action="home.do">
		<input type="submit" value="Home" />
	</form>
	<br>

	<c:forEach items="${devs}" var="d">
		<a href="getData.do?id=${d.id }">${d.firstName} ${d.lastName }</a>
		<br>
	</c:forEach>

	</div>
</body>
</html>