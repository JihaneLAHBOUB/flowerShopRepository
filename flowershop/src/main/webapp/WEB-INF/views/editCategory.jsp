<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Bouquet</title>
</head>
<body>

	
	<form action="updateCategories" method="post">
	<pre>
	
	Id : <input type="text" name="id" value="${Category.id }" readonly/>
	
	Name : <input type="text" name="name" value="${Category.name }"/>
	
	Description : <input type="text" name="description" value="${Category.description }"/>
			 
	<input type="submit" value="Update"/>
	</pre>
	</form>
	
	
</body>
</html>