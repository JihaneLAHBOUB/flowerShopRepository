<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Flower Shop</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>	
	
<link rel="stylesheet" type="text/css" href="css/styleAdmin.css">
<link href="css/bootstrap.min.css" rel="stylesheet"> 
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.9.0/css/all.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.9.0/css/v4-shims.css">
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
					
					<ul class="pager">
					    <li class="next"><a href="/flowershop/display">previous</a></li>
					 </ul>
				
					<h1> <small> Update Bouquet Flower: </small> </h1>
					<hr>
					<br>
					<form action="updateFlowers" method="post" style="width: 500px;margin-left: 22%;">
						<div class="form-group">
							<label for="id">Bouquet Flower ID :</label>
							<input type="text" name="id" id="id" value="${Flower.id }" class="form-control" readonly />
						</div>
						<div class="form-group">
							<label for="name">Bouquet Flower Name :</label>
							<input type="text" name="name" value="${Flower.name }" class="form-control" required="required" />
						</div>
						<div class="form-group">
							<label for="price">Price :</label>
							<input type="text" name="currentPrice" value="${Flower.currentPrice }" class="form-control" required="required"/>
						</div>
						<div class="form-group">
							<label for="quantity">Quantity :</label>
							<input type="text" name="quantity" value="${Flower.quantity }" class="form-control" required="required" />
						</div>
						<div class="form-group">
							<label for="category">Category :</label>
						 	<select name="category_id" id="category" class="form-control">
						 		<c:forEach items="${categoryList }" var="category">
									<option value="${category.id }" ${Flower.category_id == category.id ? 'selected'  : '' }> ${category.name } </option>
								</c:forEach>
							</select>
						</div>
						<div class="form-group">
							<label for="description">Description :</label>
							<input type="text" name="description" value="${Flower.description }" class="asTextArea" />
						</div>
					<input type="submit" value="Update" class="btn btn-info"/>
				</form>	
				</div>
		</div>
</div>

</body>
</html>