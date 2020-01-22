<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flower Shop</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link href="css/bootstraplogin.min.css" rel="stylesheet"> 
<link rel="stylesheet" type="text/css" href="css/loginstyle.css">
</head>
<body>

<div class="container">
	<div class="row">
        <nav class="navbar navbar-default">
            <h3 class="text-center">Flower Shop</h3>
        </nav>
	</div>
    <div class="row">
         <div class="col-xs-6">
             <img src="img/admin/graphic.svg" alt=""/>
         </div>
         <div class="col-xs-6" id="helo">
         
                <h2 class="text-center">Welcome back.</h2>
            	<br>
            	<span style="color: red;font-size: x-large;"> ${error }</span>
            	
            	<form action='loginAdmin' method="post">
            	
            		<label style="font-size: larger;">Username :</label>

					<input type="text" name="user" id="marg" class="form-control size" required="required"/><br>
					
					<label style="font-size: larger;">Password :</label>
					<br>
					<input type="password" name="password" class="form-control col-sm-6 size" required="required"/>
					
					<input type="submit" value="login" class="btn btn-primary margbtn"/>		
						
				</form>
		</div>
	</div>
</div>
	
</body>
</html>