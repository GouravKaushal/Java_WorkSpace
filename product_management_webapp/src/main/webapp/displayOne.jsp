<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Display All</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" />
</head>

<body>
<div class="jumbotron text-center bg-info">
    <h1 class="display-1 text-warning">Display Particular Product </h1>
    <p class="lead text-white"><em>This page will display the details about a particular product.</em></p>
    
    	<form action="products" name="form" method="post">

		<div class="form-group   p-3 mb-2 bg-info text-white">
	
			<div class="container" style="width: 35%;">

				<label for="productCost" class="mt-2">Product ID</label>
				<input type="number" class="form-control" id="productCost" placeholder="Enter Product ID" name="productId"
					required>

				<div class="text-center mt-4">
				<input type="hidden" name="action" value="displayOne"/>
					<button  id="btn-insert" type="submit" class=" btn btn-success mr-3" style="width: 10rem;">Find</button>
						<a class="btn btn-primary" href="index.html" role="button">Home</a>
				</div>
				
			</div>
		</div>
	</form>

  </div>
</body>

</html>