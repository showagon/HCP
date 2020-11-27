<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor List</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">


<a href="/user/logout" class="btn btn-secondary">Logout</a>

<h3>Hi ${pname}</h3>
<h1>Doctors List</h1>
<table class="table table-striped">
  <tr>
    <th>ID</th>
    <th>Doctor Name</th> 
    <th>Department</th>
    <th>Experience</th>
    <th>Fee</th>
    <th>Action</th>
  </tr>
 <c:forEach var="tempdoc" items="${doctorlist}">
  <c:url var="updateLink" value="appointment">
     <c:param name="id" value="${tempdoc.id}"/>
  </c:url>
  
  <tr>
   
    <td>${tempdoc.id}</td> 
    <td>${tempdoc.name}</td>
    <td>${tempdoc.dept}</td>
    <td>${tempdoc.experience}</td>
    <td>Rs. ${tempdoc.fee}</td>
  
    <td><a href="${updateLink}">Select</a></td>
  </tr>
  </c:forEach>
  
</table>
</div>
</body>
</html>