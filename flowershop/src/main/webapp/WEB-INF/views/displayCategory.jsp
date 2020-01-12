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

	<h2>Flower's Stock :</h2>
	<table border="1">
	
		<tr>
			<th>id</th>
			<th>Name</th>
			<th>Description </th>
			<th>State</th>
		</tr>
		
		<c:forEach items="${listCategoryDTO }" var="category">
			<tr>
				<td> ${category.id } </td>
				<td> ${category.name } </td>
				<td> ${category.description } </td>
				<td> <a href="deleteCategory?id=${category.id}">Delete</a>
				<td> <a href="updateCategory?id=${category.id}">Update</a>
			</tr>
		</c:forEach>
	</table>
	<a href="showCreateCategory">Add Flowers</a>
</body>
</html>