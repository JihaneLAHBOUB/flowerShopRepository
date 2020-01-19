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

	<h2>Orders :</h2>
	<table border="1">

		<tr>
			<th>id</th>
			<th>Name</th>
			<th>Date Creation</th>
			<th>status</th>
			<th>Client</th>
		</tr>

		<c:forEach items="${listOrdersDTO }" var="order">
			<tr>
				<td>${order.id }</td>
				<td>${order.name }</td>
				<td>${order.dateCreation }</td>
				<td>${order.status }</td>
				<td>${order.usernameDTO }</td>
				<td><a href="updateStatus?id=${order.id}">Validate Order</a>
				<td><a href="deleteOrder?id=${order.id}">Delete</a>
			</tr>
		</c:forEach>
	</table>

</body>
</html>