<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Developer</title>
</head>
<body>
	<form action="home.do">
		<input type="submit" value="Home" />
	</form>
	
	<br>
	 
	<h3>Add Developer</h3>
	<h4>Please provide the following details:</h4>
	<form action="update.do" method="post">
		<label for="firstName">First Name: </label> <input type="text" name="firstName" value="${dev.firstName }"/><br>
		<label for="lastName">Last Name: </label> <input type="text" name="lastName" value="${dev.lastName }" /><br>
		<label for="gender">Gender: </label> <input type="text" name="gender" value="${dev.gender }" /><br>
		<label for="category">Category: </label> <input type="text" name="category" value="${dev.category }"/><br>
		<label for="learnedBy">Learned By: </label> <input type="text" name="learnedBy" value="${dev.learnedBy }"/><br>
		<label for="schoolAttended">School Attended: </label> <input type="text" name="schoolAttended" value="${dev.schoolAttended }"/><br>
		<label for="favoriteLanguage">Favorite Language:</label> <input type="text" name="favoriteLanguage" value="${dev.favoriteLanguage }"/><br>	
		<input type="submit" value="Update" />
	</form>

</body>
</html>