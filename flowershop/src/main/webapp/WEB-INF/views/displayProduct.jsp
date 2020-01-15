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
			<th>Quantity </th>
			<th>description</th>
			<th>price</th>
			<th>photo</th>
		</tr>
		
		<c:forEach items="${listProductDTO }" var="product">
			<tr>
				<td> ${product.id } </td>
				<td> ${product.name } </td>
				<td> ${product.quantity } </td>
				<td> ${product.description } </td>
				<td> ${product.currentPrice } </td>
				<td> ${product.photoName } </td>
				<td> <a href="addProduct?id=${product.id}">Add To Cart</a>
			</tr>
		</c:forEach>
	</table>
</body>
</html>