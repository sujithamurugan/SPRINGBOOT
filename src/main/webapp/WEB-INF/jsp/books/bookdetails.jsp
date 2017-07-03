<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Books</title>
</head>
<body>
 <form action ="../details"  method = GET> 
 <div><%@ include file="../layout/sidebar.jsp"%></div>
		<div class="main-panel">

			<div><%@ include file="../layout/header.jsp"%></div>
			<div class="content">

<table border=6>
		<tr>
			<th>id</th>
			<th>title</th>
			<th>author</th>
			<th>publishdate</th>
			<th>content</th>
			<th>price</th>
			<th>status</th>
			
			

		</tr>
		
			<tr>
				<td>${selectbook.id}</td>
				<td>${selectbook.title}</td>
				<td>${selectbook.author}</td>
				<td>${selectbook.publishdate}</td>
				<td>${selectbook.content}</td>
  				<td>${selectbook.price}</td>
  				<td>${selectbook.status}</td>
  				
			
				 
				<td><button type="submit"> <a href="view" >add cart</a></button></td>
			

			</tr>
		
		
		        
	</table> 


</form>

</body>
</html>