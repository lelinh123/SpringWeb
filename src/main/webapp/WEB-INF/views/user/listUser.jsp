<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>List User</h1>
	
	<form action="/listUser" method="get">
		<input type="text" name="searchInput">
		<input type="submit" value="Search">
	</form>
	
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Username</th>
			<th>Password</th>
			<th>Address</th>
			<th></th>
		</tr>
		
		<c:forEach var="u" items="${users}">
			<tr>
			<td>${u.id}</td>
			<td>${u.username}</td>
			<td>${u.password}</td>
			<td>${u.address}</td>
			<td>
				<button><a href="/user/${u.id }">View</a></button>
				<button><a href="/updateUser/${u.id }">Edit</a></button>
				<button><a href="/deleteUser/${u.id }">Delete</a></button>
			</td>
			
		</tr>
		</c:forEach>
	</table>
	
	
</body>
</html>