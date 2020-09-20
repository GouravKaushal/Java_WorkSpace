<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Insertion Successfull</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" />
</head>

<body>


	<div class="jumbotron text-center">
        <h1 class="display-4">Insertion Successfull</h1>
        <p class="lead">Product inserted successfully with product id <dd><%=request.getAttribute("productId")%> </dd>  <hr class="my-4">
        
        <a class="btn btn-primary" href="insertProduct.html" role="button">Add More Product</a>
        <a class="btn btn-primary" href="index.html" role="button">Home</a>
      </div>

</body>

</html>