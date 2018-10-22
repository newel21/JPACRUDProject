<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>

	<h2>Developer Database</h2>

	<h3>Search by ID</h3>
	<form action="getData.do" method="GET">
		ID: <input type="text" name="id" size=4 /> 
		<input type="submit" value="Search" />
	</form>
	
	<br>

	<h3>Developers on File</h3>
	<form action="listDevs.do" method="GET">
		<input type="submit" value="View" />
	</form>

	<br>

	<h3>Delete by ID</h3>
	<form action="deleteDev.do" method="POST">
		ID: <input type="text" name="id" size=4 /> 
		<input type="submit" value="Delete" />
	</form>
	
	 <br>
	 
	<h3>Add Developer</h3>
	<h4>Please provide the following details:</h4>
	<form action="addDev.do" method="post">
		<label for="firstName">First Name: </label> <input type="text" name="firstName" /><br>
		<label for="lastName">Last Name: </label> <input type="text" name="lastName" /><br>
		<label for="gender">Gender: </label> <input type="text" name="gender" />(Male, Female)<br>
		<label for="category">Category: </label> <input type="text" name="category" />(Beginner, Mid-level, Expert)<br>
		<label for="learnedBy">Learned By: </label> <input type="text" name="learnedBy" />(Self-taught, Coding Bootcamp, University)<br>
		<label for="schoolAttended">School Attended: </label> <input type="text" name="schoolAttended" /><br>
		<label for="favoriteLanguage">Favorite Language:</label> <input type="text" name="favoriteLanguage" />(Java, Python, JavaScript, Other)<br>	
		<input type="submit" value="Add" />
	</form>

</body>
</html>

