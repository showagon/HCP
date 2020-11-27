<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Appointment</title>
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
<a href="/user/logout" class="btn btn-secondary">Logout</a>
<form action="/user/bookappt" method="post" class="main-css" >

<div class="form-group">
<label for="oa">Patient Name</label>
<input name="pname" id="oa" class = "form-control" value="${pname}">
</div>

<div class="form-group">
<label for="num">Doctor Name</label>
<input name="dname" id="num" class = "form-control" value="${doctordetails.name}"}>
</div>

<div class="form-group">
<label for="num">Doctor Fee</label>
<input name="fee" id="num" class = "form-control" value="${doctordetails.fee}">
</div>


<div class="form-group">
<label for="num">Appointment Date</label>
<input name="appdate" id="num" class = "form-control" type="date">
</div>

<div class="form-group">
<label for="ac">Appointment Time</label>
<input name="apptime" id="ac" class = "form-control" type="time">
</div>



<div class="form-group">
<input type="submit" name="pwd" value="Book" class="btn btn-primary btn-block">
</div>


</form>
</div>


</body>
</html>