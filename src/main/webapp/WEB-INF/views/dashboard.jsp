<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Health App</title>
<style>
div
{

}
.d1
{
  border: 1px solid black;
  height: 150px;
  width: 150px;
  float: left;
}

.d2
{
  margin-left:50px;
  border: 1px solid black;
  height: 150px;
  width: 150px;
  float: left;
}

.d3
{
  border: 1px solid black;
  height: 150px;
  width: 150px;
  float: left;
  margin-left:50px;
}

.d4
{
  border: 1px solid black;
  height: 150px;
  width: 150px;
  float: left;
  margin-left:50px;
}
.m1{
  height: 150px;
  width: 150px;
}
.b1{
float:right;
}

</style>
</head>
<body>
Hi ${pname}<a href="/user/logout" class="btn btn-secondary">Logout</a><div class="b1"><a href="/user/bookingHistory?pname=Raju">Booking History</a></div>
<h1>Hospital Department</h1>
<div class="container">
<div class="d1">
   <a href="/user/dept?id=1">
    <img src="${context}images/chy.jpg" class="m1">
    <div>pathelogy</div>
  </a> 
</div>
<div class="d2">
   <a href="/user/dept?id=2">
    <img src="${context}images/hyd.jpg" class="m1">
    <div>Urology</div>
  </a> 
</div>
<div class="d3">
   <a href="/user/dept?id=3">
    <img src="http:${context}/images/tul.jpg" class="m1">
    <div>Cardology</div>
  </a> 
  
</div>

<div class="d4">
   <a href="/user/dept?id=4">
    <img src="images/tul.jpg" class="m1">
    <div>ENT</div>
  </a> 
  
</div>

</div>
</body>
</html>
