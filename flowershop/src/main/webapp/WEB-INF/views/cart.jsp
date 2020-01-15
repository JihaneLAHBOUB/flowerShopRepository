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
			<th>photo</th>
			<th>Name</th>
			<th>description</th>
			<th>Quantity </th>
			<th>price</th>
			<th> total</th>
		</tr>
		
		<c:forEach items="${sessionScope.cart }" var="item">
			<tr>
				
				<td> ${item.flower.photoName } </td>
				<td> ${item.flower.name } </td>
				<td> ${item.flower.description } </td>
				<td> ${item.quantity } </td>
				<td> ${item.flower.currentPrice } </td>
				<td> ${item.flower.currentPrice * item.quantity} </td>
<%-- 				<td> <a href="buyProduct?id=${product.id}">Buy</a> --%>
			</tr>
		</c:forEach>
	</table>
	<a href="product">Continue Shopping</a>
</body>
</html>