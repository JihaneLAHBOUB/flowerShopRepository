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

	
	<form action="updateFlowers" method="post">
	<pre>
	
	Id : <input type="text" name="id" value="${Flower.id }" readonly/>
	
	Name : <input type="text" name="name" value="${Flower.name }"/>
	
	Description : <input type="text" name="description" value="${Flower.description }"/>
	
	Current Price : <input type="text" name="currentPrice" value="${Flower.currentPrice }"/>
	
	Quantity : <input type="text" name="quantity" value="${Flower.quantity }"/>
	
	Category : <input type="text" name="category_id" value="${Flower.category_id }" />
			 
	<input type="submit" value="Update"/>
	</pre>
	</form>
</body>
</html>