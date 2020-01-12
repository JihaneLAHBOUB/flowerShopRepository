<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Bouquet</title>
</head>
<body>

	
	<form action="saveCategory" method="post">
	<pre>
	
	Name : <input type="text" name="name"/>
	
	Description : <input type="text" name="description"/>
	
	<input type="submit" value="save"/>
	</pre>
	</form>
	${msg }
	<a href="displayAllCategories">View All</a>
</body>
</html>