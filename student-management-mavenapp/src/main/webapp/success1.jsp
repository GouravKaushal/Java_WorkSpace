<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Success</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" />

</head>

<body>
	<div class="jumbotron jumbotron-fluid text-center">
		<h1 class="display-3 text-center mb-3">Welcome...!!!! </h1>


		<h1 class="display-4 mt-3  mb-4 text-center">Student Details</h1>

		<div class="container mt-4 text-center pl-4" style="width: 40rem;">
			<dl class="row mt-4 ml-4 text-left">
				<dt class="col-sm-3">First Name</dt>
				<dd class="col-sm-9"><%=request.getAttribute("firstName")%> </dd>

				<dt class="col-sm-3">Last Name</dt>
				<dd class="col-sm-9"><%=request.getAttribute("lastName")%></dd>

				<dt class="col-sm-3">Email</dt>
				<dd class="col-sm-9"><%=request.getAttribute("email")%></dd>

				<dt class="col-sm-3">Contact</dt>
				<dd class="col-sm-9"><%=request.getAttribute("contact")%></dd>

				<dt class="col-sm-3">Date of Birth</dt>
				<dd class="col-sm-9"><%=request.getAttribute("date")%></dd>

				<dt class="col-sm-3">Gender</dt>
				<dd class="col-sm-9"><%=request.getAttribute("gender")%></dd>

				<dt class="col-sm-3">Address</dt>
				<dd class="col-sm-9"><%=request.getAttribute("address")%></dd>

				<dt class="col-sm-3">Hobbies</dt>
				<dd class="col-sm-9"><%=request.getAttribute("hobbies")%></dd>

				<dt class="col-sm-3">Technologies</dt>
				<dd class="col-sm-9"><%=request.getAttribute("technologies")%></dd>

			</dl>
		</div>


		<a class="btn btn-primary mt-4" href="index.html" role="button">Home</a>
	</div>

</body>

</html>