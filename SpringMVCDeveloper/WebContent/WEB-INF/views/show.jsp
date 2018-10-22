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
	<c:choose>

		<c:when test="${! empty dev}">
			<strong>ID: </strong>${dev.id}<br>
			<strong>Name: </strong>${dev.firstName} ${dev.lastName } <br>
			<strong>Gender: </strong>${dev.gender} <br>
			<strong>Category: </strong>${dev.category} <br>
			<strong>Learned By: </strong>${dev.learnedBy} <br>
			<strong>School Attended: </strong>${dev.schoolAttended} <br>
			<strong>Favorite Language: </strong>${dev.favoriteLanguage} <br>
			<form action="edit.do" method="POST">
				<input type="hidden" name="id" value="${dev.id}">
				<input type="submit" value="Edit" />
			</form>
			<form action="deleteDev.do" method="POST">
				<input type="hidden" name="id" value="${dev.id}">
				<input type="submit" value="Delete" />
			</form>
		</c:when>

		<c:otherwise>
			<p>NOT ON FILE</p>
		</c:otherwise>

	</c:choose>
	</div>
</body>
</html>