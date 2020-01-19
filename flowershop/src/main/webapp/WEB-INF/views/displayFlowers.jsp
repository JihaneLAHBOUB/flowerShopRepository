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

	<h2>Flower's Stock :</h2>
	<table border="1">

		<tr>
			<th>id</th>
			<th>Name</th>
			<th>Quantity</th>
			<th>description</th>
			<th>price</th>
		</tr>

		<c:forEach items="${listFlowerDTO }" var="flower">
			<tr>
				<td>${flower.id }</td>
				<td>${flower.name }</td>
				<td>${flower.quantity }</td>
				<td>${flower.description }</td>
				<td>${flower.currentPrice }</td>
				<td><a href="deleteFlower?id=${flower.id}">Delete</a>
				<td><a href="updateFlower?id=${flower.id}">Update</a>
			</tr>
		</c:forEach>
	</table>
	<a href="showCreate">Add Flowers</a>
</body>
</html>