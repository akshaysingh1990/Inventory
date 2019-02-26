<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<%@ page session="false"%><html>
<head>
	<link rel="stylesheet"  href="<c:url value="/resources/style.css" />">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

</head>
<body>

	<h2 id="headerId" class="header_class">this is my front page</h2>
	
	<a href="/itemstransaction/getItem"><b>ITEMS</b></a>
	<br>
	<a href="/itemstransaction/createItem"><b> CREATE ITEM</b></a>
	<br>
	<a href="/itemstransaction/getCustomer"><b> CUSTOMERS</b></a>
	<br>
	<a href="/itemstransaction/createCustomer"><b> CREATE CUSTOMER</b></a>
	<br>
	<a href="/itemstransaction/sellItem"><b> SELL ITEM</b></a>
	<br>

<h2>My h2</h2>
</body>
</html>
