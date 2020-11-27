<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

  <style>
    .bg
    {
      background:url("yellow-bokeh-photo-949587.jpg") no-repeat;
      width: 100%;
      height: 100vh;
    }
  .main-css{
  width:400px; 
  background: #fff;
  margin:auto;  
  border-radius:10px;
  box-shadow:0px 0px 10px 0px;
  padding:30px;
  margin-top:30px;
  }
  .m1{
  color:green;
  }
  .m2{
  color:green;
  }
  </style>
</head>
<body class="bg">
<div class="container ">
<br>
<br>
${SPRING_SECURITY_LAST_EXCEPTION.message}
<form action="/login" method="post" class="main-css">
<div class="form-group">
<label for="user">Username</label>
<input type="text" name="username" id="user" class = "form-control"/>
</div>
<div class="form-group">
<label for="pawd">Password</label>
<input type="text" name="password" id="pawd" class="form-control"/>
</div>
<div class="form-group">
<div class ="form-check">
<input type="checkbox" name="un" id="user" class="form-check-input">
<label for="user" class="form-check-label">Remember Password</label>
&emsp;&emsp;&emsp;&emsp;<a href="/user/userRegister" >Signup</a>
</div>
</div>
<div class="form-group">
<input type="submit" value="Login" id="pawd" class="btn btn-primary btn-block"/>
</div>



 
       <span class="m1">${savemsg}</span>

	 
	 

	
 


</form>

</div>

</body>
</html>

