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
				
				<div id="myCarousel" class="carousel slide" data-ride="carousel">
				    <!-- Indicators -->
				    <ol class="carousel-indicators">
				      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				      <li data-target="#myCarousel" data-slide-to="1"></li>
				      <li data-target="#myCarousel" data-slide-to="2"></li>
				    </ol>
				
				    <!-- Wrapper for slides -->
				    <div class="carousel-inner">
				
				      <div class="item active">
				        <img src="img/cart/cart-1.jpg" alt="ray ban" style="width:100%;">
				        <div class="carousel-caption">
				          <h3>EVERY MONTH</h3>
				          <p>receive our new products, exclusive offers.</p>
				        </div>
				      </div>
				
				      <div class="item">
				        <img src="img/cart/cart-3.jpg" alt="header" style="width:100%;">
				        <div class="carousel-caption">
				          <h3></h3>
				          <p></p>
				        </div>
				      </div>
				    
				      <div class="item">
				        <img src="img/cart/cart-2.jpg" alt="header-ray-ban-1" style="width:100%;">
				        <div class="carousel-caption">
				          <h3>OUR STYLES, YOUR OWN WAY.</h3>
				          <p>Exclusively on Flowershop.com</p>
				        </div>
				      </div>
				  
				    </div>
				
				    <!-- Left and right controls -->
				    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
				      <span class="glyphicon glyphicon-chevron-left"></span>
				      <span class="sr-only">Previous</span>
				    </a>
				    <a class="right carousel-control" href="#myCarousel" data-slide="next">
				      <span class="glyphicon glyphicon-chevron-right"></span>
				      <span class="sr-only">Next</span>
				    </a>
				  </div>
				   <div class="text-center" style="padding: 0px 120px;">
<!-- 					  <img alt="" src="img/logo/logo.png"> --><br><br>

					  <p>Specialized in floral arrangement, Our store offers flowers online through its website, quality service guaranteed for send flower to Morocco.</p>
					</div> 
					
					<div class="row">
					    <div class="col-sm-4">
					    <br>
					      <p class="text-center"><strong>Services</strong></p>
					      <img src="img/admin/service-left-img.jpg" class="img-circle person" alt="Random Name" width="255" height="255" style="margin-left: 35px;">
					    </div>
					    <div class="col-sm-4">
					    <br>
					      <p class="text-center"><strong>Garantie</strong></p>
					      <img src="img/admin/410-article_vert_garantie_casse.jpg.jpg" class="img-circle person" alt="Random Name" width="255" height="255" style="margin-left: 35px;">
					    </div>
					    <div class="col-sm-4">
					    <br>
					      <p class="text-center"><strong>Satisfaction</strong></p>
					      <img src="img/admin/customer-satisfaction.jpg" class="img-circle person" alt="Random Name" width="255" height="255" style="margin-left: 35px;">
					    </div>
					</div>  
				
	</div>
</div>
</div>
	

</body>
</html>