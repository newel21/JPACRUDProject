<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Developer</title>
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
	 
	<h3>Update Developer</h3>
	<h4>Please provide the following details:  with id = ${dev.id }</h4>
	<form action="update.do" method="post">
		<label for="firstName">First Name: </label> <input type="text" name="firstName" value="${dev.firstName }"/><br>
		<label for="lastName">Last Name: </label> <input type="text" name="lastName" value="${dev.lastName }" /><br>
		<label for="gender">Gender: </label> <input type="text" name="gender" value="${dev.gender }" />(Male, Female)<br>
		<label for="category">Category: </label> <input type="text" name="category" value="${dev.category }"/>(Beginner, Mid-level, Expert)<br>
		<label for="learnedBy">Learned By: </label> <input type="text" name="learnedBy" value="${dev.learnedBy }"/>(Self-taught, Coding Bootcamp, University)<br>
		<label for="schoolAttended">School Attended: </label> <input type="text" name="schoolAttended" value="${dev.schoolAttended }"/><br>
		<label for="favoriteLanguage">Favorite Language:</label> <input type="text" name="favoriteLanguage" value="${dev.favoriteLanguage }"/>(Java, Python, JavaScript, Other)<br>	
		<input type="hidden" value="${dev.id }" name="id"/>
		<input type="submit" value="Update" />
	</form>

	</div>
</body>
</html>