<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h3>Search by ID</h3>
	<form action="getData.do" method="GET">
		ID: <input type="text" name="id" size=4 /> <input type="submit"
			value="Search" />
	</form>
	
	<br>
	
	<h3>Developers on File</h3>
	<form action="getData.do" method="GET">
		<input type="submit" value="View" />
	</form>
	
</body>
</html>

<!--  
Developer findById(int id);
	List<Developer> findAll();
	Developer add(Developer dev);
	Developer update(Developer dev);
	boolean delete(Developer dev);
	boolean deleteById(int devId);-->