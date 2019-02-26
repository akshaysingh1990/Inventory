

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>sdgsgf</title>

	<link rel="stylesheet"  href="<c:url value="/resources/style.css" />">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

</head>
<body>
	<tr>
	<th>ID</th>
		<th>NAME</th>
		<th>COSTPRICE</th>
		<th>SELLINGPRICE</th>
	    <th>AMOUNT</th>
	</tr>
	<br>
	<c:forEach items="${items}" var="allItem">
		<tr>
			<td>${allItem.getId()}</td>

			<td>${allItem.getName()}</td>
			<td>${allItem.getCostPrice()}</td>
			<td>${allItem.getSellingPrice()}</td>
			<td>${allItem.getAmount()}</td>
			
		<!--  	<td><a class="btn btn-danger" href="employee/${allEmployee.getId()}/delete">delete</a></td> ->
			<td ><a class="btn btn-primary" href="employee/${allEmployee.getId()}/edit">edit</a></td>   -->

			<br>

		</tr>
	</c:forEach>
	
	 
</body>
</html>