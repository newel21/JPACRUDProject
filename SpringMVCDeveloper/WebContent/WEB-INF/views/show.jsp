<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Film Details</title>
</head>
<body>
	<form action="home.do">
		<input type="submit" value="Home" />
	</form>
	<div>
		<h4><strong>Name: </strong>${film.title}</h4>
		<p><strong>Release Year: </strong>${film.releaseYear}</p>
		<p><strong>Description: </strong>${film.description}</p>
		<p><strong>Length: </strong>${film.length}</p>
	</div>
</body>
</html>