<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Developer Details</title>
</head>
<body>
	<form action="home.do">
		<input type="submit" value="Home" />
	</form>
	<br>
	<c:choose>

		<c:when test="${! empty dev}">
			<strong>Name: </strong>${dev.firstName} ${dev.lastName } <br>
			<strong>Gender: </strong>${dev.gender} <br>
			<strong>Category: </strong>${dev.category} <br>
			<strong>Learned By: </strong>${dev.learnedBy} <br>
			<strong>School Attended: </strong>${dev.schoolAttended} <br>
			<strong>Favorite Language: </strong>${dev.favoriteLanguage} <br>
		</c:when>

		<c:when test="${! empty devs}">
			<c:forEach items="${devs}" var="d">
				<a href="getFilm.do?fid=${d.id}">${d.firstName} ${d.lastName }</a>
			</c:forEach>
		</c:when>
			
		<c:otherwise>
			<p>NOT ON FILE</p>
		</c:otherwise>
			
	</c:choose>
</body>
</html>