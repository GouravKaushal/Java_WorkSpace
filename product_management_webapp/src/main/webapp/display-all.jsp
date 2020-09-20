<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Display All</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" />
</head>

<body>

	<sql:setDataSource var="productdb" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/javatraining"
		user="root" password="12345" />


	<sql:query var="pr" dataSource="${productdb}">
		SELECT * FROM products;
	</sql:query>

	<div class="jumbotron text-center">
		<h1 class="display-4">All Products</h1>
		<p class="lead">Here is the list of all products available in the store :
			<hr class="my-4">


	<div class="container" style="width:500px">
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Product Name</th>
					<th scope="col">Product Cost</th>
				</tr>
			</thead>
			<c:forEach var="table" items="${pr.rows}">
				<tr>
					<td>
						<c:out value="${table.id}" />
					</td>
					<td>
						<c:out value="${table.productName}" />
					</td>
					<td>
						<c:out value="${table.productCost}" />
					</td>

				</tr>
			</c:forEach>

		</table>
	</div>


		<a class="btn btn-primary " href="index.html" role="button">Home</a>
	</div>
</body>

</html>