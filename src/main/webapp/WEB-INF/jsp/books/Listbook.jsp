<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order Summary</title>
<link href="../assets/css/bootstrap.css" rel="stylesheet" />
<link href="../assets/css/login-register.css" rel="stylesheet" />
<link rel="stylesheet"
	href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" />

<script src="../assets/jquery/jquery-1.10.2.js" type="text/javascript"></script>
<script src="../assets/js/bootstrap.js" type="text/javascript"></script>

<link rel="stylesheet" href="../assets/css/bootstrap.min.css"  />
<link rel="stylesheet" href="../assets/css/bootstrap_custom_nav_bar.css" />
<link rel="stylesheet" href="../assets/css/style.css" />
<link rel="stylesheet" href="../assets/css/mdb.min.css" />


<script src="../assets/js/jquery.min.js"></script>
<script src="../assets/js/bootstrap.min.js"></script>
<script src="../assets/js/mdb.min.js"></script>
<script src="../assets/js/tether.min.js"></script>
</head>
<body>
<form action="book" method=GET></form>
<%@ include file ="../layout/header.jsp" %>
<%@ include file="../layout/sidebar.jsp" %>
	<table border=1>
		<tr>
			<th>id</th>
			<th>title</th>
			<th>price</th>
			<th>publishdate</th>
			<th>VIEW</th>
		</tr>
		<c:forEach items="${books}" var="Book">
			<tr>
				
				<td><input type="number" name="id" value="${Book.id}" /></td>
				<td><input type="text" name="title" value="${Book.title}" /></td>
				<td><input type="text" name="price" value="${Book.price}" /></td>
				<td><input type="text" name="price" value="${Book.publishdate}" /></td>
				
				<td><button type="submit"> <a href="../Book/${Book.id }" >view</a></button></td>
		</c:forEach>
	
                                               
		</table>	
</body>
</html>