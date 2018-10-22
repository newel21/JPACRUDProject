<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Added Developer</title>
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
	
	<h3>This developer has been added</h3>
	<br>
			<strong>ID: </strong>${dev.id} <br>
			<strong>Name: </strong>${dev.firstName} ${dev.lastName } <br>
			<strong>Gender: </strong>${dev.gender} <br>
			<strong>Category: </strong>${dev.category} <br>
			<strong>Learned By: </strong>${dev.learnedBy} <br>
			<strong>School Attended: </strong>${dev.schoolAttended} <br>
			<strong>Favorite Language: </strong>${dev.favoriteLanguage} <br>		
	</div>
</body>
</html>