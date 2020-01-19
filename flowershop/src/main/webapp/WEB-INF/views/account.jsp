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

	<h2>Account Login :</h2>

	<form action="login" method="post">
		<span>${error }</span>
		<table border="1">
			<tr>
				<td>Username</td>
				<td><input type="text" name="username"></td>
			</tr>

			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			</tr>

			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Login"></td>
				<br />
				<a href="sign">Sign Up</a>
			</tr>
		</table>
	</form>

</body>
</html>