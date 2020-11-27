<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Appointment List</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">




<h3>Hi ${pname}</h3><a href="/user/logout" class="btn btn-secondary">Logout</a>
<h1>Doctors List</h1>
<table class="table table-striped">
  <tr>
    <th>ID</th>
    <th>Patient Name</th> 
    <th>Doctor Name</th>
    <th>Fee</th>
    <th>Appointment Date</th>
    <th>Appointment Time</th>
    <th>Action</th>
  </tr>
 <c:forEach var="tempdoc" items="${apptlist}">
  <c:url var="updateLink" value="appointment">
     <c:param name="id" value="${tempdoc.id}"/>
  </c:url>
  
  <c:url var="deleteLink" value="deleteappt">
     <c:param name="id" value="${tempdoc.id}"/>
  </c:url>
  
  <tr>
   
    <td>${tempdoc.id}</td> 
    <td>${tempdoc.pname}</td>
    <td>${tempdoc.dname}</td>
    <td>Rs. ${tempdoc.fee}</td>
    <td>${tempdoc.appdate}</td>
    <td>${tempdoc.apptime}</td>
  
    <td><a href="${updateLink}">Update</a> | <a href="${deleteLink}">Cancel</a></td>
  </tr>
  </c:forEach>
  
</table>
</div>
</body>
</html>