<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Bouquet</title>
</head>
<body>


	<form action="saveCategory" method="post">
		<pre>
	
	Name : <input type="text" name="name" />
	
	Description : <input type="text" name="description" />
	
	<input type="submit" value="save" />
	</pre>
	</form>
	${msg }
	<a href="displayCategories">View All</a>
</body>
</html>