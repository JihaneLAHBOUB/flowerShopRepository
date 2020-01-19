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


	<form action="saveFlowers" method="post">
		<pre>
	
	Name : <input type="text" name="name" />
	
	Description : <input type="text" name="description" />
	
	Current Price : <input type="text" name="currentPrice" />
	
	Quantity : <input type="text" name="quantity" />
	
	Category : <select name="category_id">
					<c:forEach items="${categoryList }" var="category">
						<option value="${category.id }"> ${category.name } </option>
					</c:forEach>
				
				</select>
	
	
	
	<input type="submit" value="save" />
	</pre>
	</form>
	${msg }
	<a href="display">View All</a>
</body>
</html>