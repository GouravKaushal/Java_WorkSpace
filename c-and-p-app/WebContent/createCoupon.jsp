<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Coupon</title>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" />
 
</head>
<body>

<div class="jumbotron jumbotron-fluid">
<div class="container" style="width:40%">
 <form action="coupons" name="form" method="post">

  <div class="form-group  p-3 mb-2 bg-info text-white">
  
  <h1 class="display-3 text-white text-center text-warning mb-3">Create Coupon</h1>
   <label for="user" >Coupon Code</label>
    <input type="text" class="form-control" id="user" placeholder="Coupon Code" name="code">
 
 
 <label for="user" >Discount</label>
    <input type="text" class="form-control" id="user" placeholder="Discount" name="discount">
    
    <label for="user" >Expiry Date</label>
    <input type="text" class="form-control" id="user" placeholder="Expiry Date" name="expiryDate">
    <input type="hidden" name="action" value="create"/>
  <button type="submit" class=" mt-3 btn btn-success  btn-block">Submit</button>

  </div>
 
 </div>
</form>
</div> 
</body>
</html>