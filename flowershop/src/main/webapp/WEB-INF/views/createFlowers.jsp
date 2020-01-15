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
	
	Quantity : <input type="text" name="quantity"/>
	
	Category : <input type="text" name="category_id" />
			 
<!-- 	Category id: <input type="text" name="categoryDTO.id" /> -->
<!-- 	Category name: <input type="text" name="categoryDTO.name" /> -->
<!-- 	Category description: <input type="text" name="categoryDTO.description" /> -->
	
	<input type="submit" value="save"/>
	</pre>
	</form>
	${msg }
	<a href="display">View All</a>
</body>
</html>