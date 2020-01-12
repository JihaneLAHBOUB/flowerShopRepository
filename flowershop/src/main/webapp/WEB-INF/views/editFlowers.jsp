<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Bouquet</title>
</head>
<body>

	
	<form action="updateFlowers" method="post">
	<pre>
	
	Id : <input type="text" name="id" value="${Flower.id }" readonly/>
	
	Name : <input type="text" name="name" value="${Flower.name }"/>
	
	Description : <input type="text" name="description" value="${Flower.description }"/>
	
	Current Price : <input type="text" name="currentPrice" value="${Flower.currentPrice }"/>
	
	
	Promotion : In Promotion	<input type="radio" name="promotion" value="true" ${Flower.promotion == 'true'? 'checked' : ''}/>
			 Out Promotion	<input type="radio" name="promotion" value="false" ${Flower.promotion == 'false'? 'checked' : ''}/>
	
	selected	 : yes	<input type="radio" name="selected" value="true" ${Flower.selected == 'true'? 'checked' : ''}/>
			 		no <input type="radio" name="selected" value="false" ${Flower.selected == 'false'? 'checked' : ''}/>
	
	available : yes	<input type="radio" name="available" value="true" ${Flower.available == 'true'? 'checked' : ''}/>
			no <input type="radio" name="available" value="false" ${Flower.available == 'false'? 'checked' : ''}/>
			 
	<input type="submit" value="Update"/>
	</pre>
	</form>
</body>
</html>