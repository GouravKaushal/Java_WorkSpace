<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" />
  
</head>
<body>



	<jsp:useBean id="user" class="com.zensar.model.User">
		<jsp:setProperty property="name" name="user"></jsp:setProperty>
		<jsp:setProperty property="age" name="user"></jsp:setProperty>
		<jsp:setProperty property="gender" name="user"></jsp:setProperty>
		<%-- <jsp.setProperty property="*" name="user"></jsp.setProperty> --%>
	</jsp:useBean>
	Name is : <jsp:getProperty property="name" name="user"></jsp:getProperty><br> 
	Age is : <jsp:getProperty property="age" name="user"></jsp:getProperty><br> 
	Gender is : <jsp:getProperty property="gender" name="user"></jsp:getProperty><br> 
	Whole Info  is : <jsp:getProperty property="userInfo" name="user"></jsp:getProperty><br>
	
	
 	<jsp:forward page="userDetails.jsp">
 	<jsp:param value="Gourav" name="name"/>
 	<jsp:param value="23" name="age"/>
 	<jsp:param value="Male" name="gender"/>
 	</jsp:forward> 

 


</body>
</html>