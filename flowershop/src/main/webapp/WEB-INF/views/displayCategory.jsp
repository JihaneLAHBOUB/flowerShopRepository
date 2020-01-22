<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flower Shop</title>
<link rel="stylesheet" type="text/css" href="css/styleAdmin.css">
<link href="css/bootstrap.min.css" rel="stylesheet"> 
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.9.0/css/all.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.9.0/css/v4-shims.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script>
	$(document).ready(function() {
		console.log('button clicked');
		$('#mytbl').DataTable();
		console.log('after button clicked');
	});
</script>

</head>
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
				<a href="/flowershop/showCreateCategory" class="btn btn-info op" ><i class="fas fa-plus"></i></a>
				</span>
				<h1> <small> List Category: </small></h1>
				<hr>
				<br>
				<table class="table table-striped table-hover" id="mytbl">
					<thead>
						<th>Category ID</th>
						<th>Category Name</th>
						<th>Description</th>
						<th class="sheap">Options</th>
					</thead>
					<tbody>

						<c:forEach items="${listCategoryDTO }" var="category">
							<tr>
								<td>${category.id }</td>
								<td>${category.name }</td>
								<td>${category.description }</td>
								<td class="sheap">
								<a href="updateCategory?id=${category.id}" class="btn btn-primary">Update</a>
								<a href="deleteCategory?id=${category.id}" onclick="return confirm('Make sure to delete all flowers in this category first.You want to continue?')" class="btn btn-danger">Delete</a>
								</td>
							</tr>
						</c:forEach>

					</tbody>
					</table>
			</div>
	</div>
</div>

</body>
</html>