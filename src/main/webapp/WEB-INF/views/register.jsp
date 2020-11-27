<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
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
  margin-top:15px;
  }
  </style>
</head>
<body class="bg">
<div class="container ">

<form action="savePatient" method="post" class="main-css" >

<div class="form-group">
<label for="num">Patient Name</label>
<input name="name" id="num" class = "form-control">
</div>

<div class="form-group">
<label for="num">Patient Username Name</label>
<input name="username" id="num" class = "form-control">
</div>


<div class="form-group">
<label for="num">Password</label>
<input name="password" id="num" class = "form-control">
</div>

<div class="form-group">
<label for="ac">Age</label>
<input name="age" id="ac" class = "form-control">
</div>

<div class="form-group">
<label for="dd">Gender</label>
<select class = "form-control" name="gender">
<option>select</option>
<option value="male">male</option>
<option value="female">female</option>
</select>
</div> 

<div class="form-group">
<label for="oa">Address</label>
<input name="address" id="oa" class = "form-control">
</div>

<div class="form-group">
<label for="oa">Mobile Number</label>
<input name="mobile" id="oa" class = "form-control">
</div>

<div class="form-group">
<input type="submit" name="pwd" value="Save" class="btn btn-primary btn-block">
</div>


</form>
</div>

</body>
</html>