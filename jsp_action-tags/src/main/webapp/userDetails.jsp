<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	After Forwarding

	User Name : <%= request.getParameter("name") %>  
	Age :<%= request.getParameter("age") %>  
	Gender : <%= request.getParameter("gender") %>  

</body>
</html>