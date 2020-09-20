<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Delete Product</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" />
</head>

<body>
<div class="jumbotron text-center bg-info">
    <h1 class="display-1 text-warning">Delete Product </h1>

    
    	<form action="products" name="form" method="post">

		<div class="form-group   p-3 mb-2 bg-info text-white">
	
			<div class="container" style="width: 35%;">

				<label for="productCost" class="mt-2">Product ID</label>
				<input type="number" class="form-control" id="productCost" placeholder="Enter Product ID" name="productId"
					required>

				<div class="text-center mt-4">
				<input type="hidden" name="action" value="delete"/>
					<button  id="btn-insert" type="submit" class=" btn btn-success mb-3" >Delete</button>
						</br>
						<a class="btn btn-primary" href="index.html" role="button">Home</a>
				</div>
				
			</div>
		</div>
	</form>

  </div>
</body>

</html>