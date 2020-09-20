<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Product Find</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" />
</head>

<body>


	<div class="jumbotron text-center">
        <h1 class="display-4">Product Details of Deleted Product</h1>
        <p class="lead"><dd><%=request.getAttribute("productDetails")%> </dd>  <hr class="my-4">
        <a class="btn btn-primary " href="deleteProduct.jsp" role="button">Delete Another Product</a>
        <a class="btn btn-primary " href="display-all.jsp" role="button">Display All Products After Deletion</a>
        <a class="btn btn-primary " href="index.html" role="button">Home</a>
      </div>

</body>

</html>