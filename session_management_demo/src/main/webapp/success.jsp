<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" />
  
</head>
<body>
	<div class="jumbotron jumbotron-fluid text-center">
	<h1 class="display-3  mb-3">Authentication Successfull</h1>
	<h2 >Hello <%=request.getAttribute("user")%></h2>
	
	
	
	
	<a class="btn btn-primary" href="next" role="button">Show more info</a>
	</div>

</body>
</html>