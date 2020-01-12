<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
     pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Bouquet</title>
</head>
<body>

	
	<form action="saveFlowers" method="post">
	<pre>
	
	Name : <input type="text" name="name"/>
	
	Description : <input type="text" name="description"/>
	
	Current Price : <input type="text" name="currentPrice"/>
	
	Promotion : In Promotion	<input type="radio" name="promotion" value="true"/>
	
			 Out Promotion	<input type="radio" name="promotion" value="false"/>
	
	selected : yes	<input type="radio" name="selected" value="true"/>
	
			 no	<input type="radio" name="selected" value="false"/>
			 
	available : In available	<input type="radio" name="available" value="true"/>
	
			 Out available	<input type="radio" name="available" value="false"/>
			 
<!-- 	Category id: <input type="text" name="categoryDTO.id" /> -->
<!-- 	Category name: <input type="text" name="categoryDTO.name" /> -->
<!-- 	Category description: <input type="text" name="categoryDTO.description" /> -->
	
	<input type="submit" value="save"/>
	</pre>
	</form>
	${msg }
	<a href="displayAllFlowers">View All</a>
</body>
</html>