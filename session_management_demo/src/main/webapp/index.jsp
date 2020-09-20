
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
<form action="login" name="form" method="post">

  <div class="form-group  p-3 mb-2 bg-info text-white">
  
  <h1 class="display-3 text-white text-center mb-3">Login Page</h1>
   <label for="user" >User Name</label>
    <input type="text" class="form-control" id="user" placeholder="User Name" name="textUser">
 
    <label for="pass" >Password</label>
    <input type="password" class="form-control" id="pass" placeholder="Password" name="textPassword">
  <button type="submit" class=" mt-3 btn btn-success btn-lg btn-block">Submit</button>
  </div>
 
 </div>
</form>
</div>
</body>
</html>