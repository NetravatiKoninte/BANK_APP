<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title></head>
<body>
<h1 align="center">Login</h1>
<form action="Login">
<table border="2">
<tr>
<td>CUSTOMERID</td>
<td><input type="text" name="custid" required></td>
</tr>

<tr>
<td>Password</td>
<td><input type="text" name="pwd" required placeholder="********"></td>
</tr>
</table>
<input type="submit" value="Login">
</form>
</body>
</html>