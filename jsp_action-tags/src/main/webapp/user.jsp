<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" />
  
</head>
<body>

<div class="jumbotron jumbotron-fluid">
<div class="container" style="width:40%">
<form action="userInfo.jsp" name="form" method="post">

  <div class="form-group  p-3 mb-2 bg-info text-white">
  
  <h1 class="display-3 text-white text-center mb-3">User Info</h1>
   <label for="user" >Name</label>
    <input type="text" class="form-control" id="user" placeholder="User Name" name="name">
 
    <label for="pass" >Age</label>
    <input type="number" class="form-control" id="pass" placeholder="Password" name="age">
    
    Gender 
		<input type="radio" value="Male" name="gender">Male <br> 
		<input type="radio" value="Female" name="gender">Female 
    
  <button type="submit" class=" mt-3 btn btn-success btn-lg btn-block">Submit</button>
  </div>
 
 </div>
</form>
</div>


	<!-- <form action="userInfo.jsp" method="post">
		Enter your name<input type="text" name="name"> 
		Enter your age<input type="text" name="age"> 
		Gender 
		<input type="radio" value="Male" name="gender">Male <br> 
		<input type="radio" value="Female" name="gender">Female 
		<input	type="submit" value="submit">
	</form> -->
</body>
</html>