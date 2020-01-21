<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/styleAdmin.css">
<link href="css/bootstrap.min.css" rel="stylesheet"> 
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.9.0/css/all.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.9.0/css/v4-shims.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<body>

<div class="container-fluid">
	<div class="row content">
			
			<div class="col-sm-3 sidenav sidebar">
					<div id="admin">
					<img src="img/admin/admin-gray.png" alt="admin">
					<div class="log">
						 <p>Admin ${sessionScope.user }</p> 
					</div>
					</div>
					<div id="mySidenav">
					  <a href="logoutAdmin" id="contact">Log out</a>
					</div>
					 <a href="/flowershop/home"><i class="fa fa-fw fa-home"></i> About Us </a>
				<br> <a href="/flowershop/displayCategories"><i class="fas fa-store-alt"></i> Go To Categories</a>
				<br> <a href="/flowershop/display"><i class="fas fa-dolly-flatbed"></i> Go To Bouquet Flowers</a>
				<br> <a href="/flowershop/displayOrders"><i class="fas fa-history"></i> Go To Orders</a>
			</div>
			
			<div class="col-sm-9" style="background-color:white;">
				<div class="header">
				</div>
				<span>
				<a href="/flowershop/showCreate" class="btn btn-info op" ><i class="fas fa-plus"></i></a>
				</span>
				<h1> <small> List Bouquet Flowers: </small></h1>
				<hr>
				<br>
				<table class="table table-striped table-hover" id="mytbl">
					<thead>
						<th>Bouquet Flower ID</th>
						<th>Bouquet Name</th>
						<th>Description</th>
						<th>Quantity</th>
						<th>Price</th>
						<th class="sheap">Options</th>
					</thead>
					<tbody>
						<c:forEach items="${listFlowerDTO }" var="flower">
							<tr>
								<td>${flower.id }</td>
								<td>${flower.name }</td>
								<td>${flower.description }</td>
								<td>${flower.quantity }</td>
								<td>${flower.currentPrice }</td>
								<td class="sheap">
								<a href="updateFlower?id=${flower.id}" class="btn btn-primary">Update</a>
								<a href="deleteFlower?id=${flower.id}" onclick="return confirm('Do you want to delete?')" class="btn btn-danger">Delete</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
		</div>
	</div>
</div>



<!-- 	<h2>Flower's Stock :</h2> -->
<!-- 	<table border="1"> -->

<!-- 		<tr> -->
<!-- 			<th>id</th> -->
<!-- 			<th>Name</th> -->
<!-- 			<th>Quantity</th> -->
<!-- 			<th>description</th> -->
<!-- 			<th>price</th> -->
<!-- 		</tr> -->

<%-- 		<c:forEach items="${listFlowerDTO }" var="flower"> --%>
<!-- 			<tr> -->
<%-- 				<td>${flower.id }</td> --%>
<%-- 				<td>${flower.name }</td> --%>
<%-- 				<td>${flower.quantity }</td> --%>
<%-- 				<td>${flower.description }</td> --%>
<%-- 				<td>${flower.currentPrice }</td> --%>
<%-- 				<td><a href="deleteFlower?id=${flower.id}">Delete</a> --%>
<%-- 				<td><a href="updateFlower?id=${flower.id}">Update</a> --%>
<!-- 			</tr> -->
<%-- 		</c:forEach> --%>
<!-- 	</table> -->
<!-- 	<a href="showCreate">Add Flowers</a> -->
</body>
</html>