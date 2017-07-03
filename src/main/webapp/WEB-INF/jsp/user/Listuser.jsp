<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="/list"  method = GET></form>
 
 <div><%@ include file="../layout/sidebar.jsp"%></div>
		<div class="main-panel">

			<div><%@ include file="../layout/header.jsp"%></div>
			<div class="content">
	
	  
			

<table border=6>
		<tr>
			<th>id</th>
			<th>name</th>
			<th>username</th>
			<th>password</th>
			<th>mobileno</th>
			<th>emailid</th>
			<th>active</th>
			<th>role</th>
			

		</tr>
		<c:forEach items="${users}" var="User" varStatus="loop">
			<tr>
				<td>${User.id}</td>
				<td>${User.name}</td>
				<td>${User.username}</td>
				<td>${User.password}</td>
				<td>${User.mobileno}</td>
  				<td>${User.emailid}</td>
  				<td>${User.active}</td>
  				<td>${User.role}</td>
  				
			
				
				
			

			</tr>
		</c:forEach>
		
		      
	</table> 




</body>
</html>