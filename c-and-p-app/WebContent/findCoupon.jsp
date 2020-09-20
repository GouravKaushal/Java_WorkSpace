<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Coupon</title>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" />
 
</head>
<body>

<div class="jumbotron jumbotron-fluid">
<div class="container" style="width:40%">
 <form action="coupons" name="form" method="post">

  <div class="form-group  p-3 mb-2 bg-info text-white">
  
  <h1 class="display-3 text-white text-center text-warning mb-3">Find Coupon</h1>
   <label for="user" >Coupon Code</label>
    <input type="text" class="form-control" id="user" placeholder="Coupon Code" name="couponCode">

	<input type="hidden" name="action" value="find"/>
  <button type="submit" class=" mt-3 btn btn-success  btn-block">Submit</button>

  </div>
 
 </div>
</form>
</div> 
</body>
</html>