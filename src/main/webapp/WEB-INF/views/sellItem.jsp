<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action= "/itemstransaction/sellItem" method = "post">


<br>


Customer<select name="customerName">
    <c:forEach items="${customers}" var="allCustomers">
       <option value = "${allCustomers.getId()}">${allCustomers.getName()}</option>
<br>
  </c:forEach>
  </select>
  Item<select name="itemName">
    <c:forEach items="${items}" var="allItems">
       <option value = "${allItems.getId()}">${allItems.getName()}</option>
<br>
  </c:forEach>
  </select>
Quantity<input type="text" name="quantity" value="0">


<input type="hidden" name="customerId">

 <input type="submit" value="Submit form">
</form>

</body>
</html>