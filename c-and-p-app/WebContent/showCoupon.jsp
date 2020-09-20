<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Coupon Created</title>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" />
 
</head>
<body>

<div class="jumbotron text-center">
  <h1 class="display-4">Coupon Details</h1>
 
 	<%=	request.getAttribute("coupon")%>
</div>


</body>
</html>