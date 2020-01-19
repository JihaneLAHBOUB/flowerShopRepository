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

	<h2>Cart Info :</h2>

	<form action="updateProduct" method="post">
		<table border="1">

			<tr>
				<th>photo</th>
				<th>Name</th>
				<th>description</th>
				<th>Quantity</th>
				<th>price</th>
				<th>total</th>
				<th>Option</th>
			</tr>

			<c:forEach items="${sessionScope.cart }" var="item">
				<tr>


					<td><img src="img/product-1.jpg" width="50" />
						${item.flowerDTO.photoName }</td>
					<td>${item.flowerDTO.name }</td>
					<td>${item.flowerDTO.description }</td>
					<td><input type="number" value="${item.quantity }"
						name="quantity" style="" /></td>
					<td>${item.flowerDTO.currentPrice }</td>
					<td>${item.flowerDTO.currentPrice * item.quantity}</td>
					<td><a href="deleteProduct?id=${item.flowerDTO.id}">Delete</a></td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="5">Total</td>
				<td>${total}</td>
			</tr>
		</table>
		<input type="submit" value="Update">

	</form>
	<a href="product">Continue Shopping</a>
	<a href="checkout">Check Out</a>
</body>
</html>