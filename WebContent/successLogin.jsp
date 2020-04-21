<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SuccessLogin</title>
</head>
<body>
<% 
 out.println("Dear"+session.getAttribute("username") + " You are successfully logged in."); 
%>

</body>
</html>