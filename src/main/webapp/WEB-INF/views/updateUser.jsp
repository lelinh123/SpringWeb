<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="POST" action="/updateUser" modelAttribute="userModel">
<label>Id: </label>
	<input type="text" name="id" value="${userModel.id }"><br>
	<label>Username: </label>
	<input type="text" name="username" value="${userModel.username }"><br>
	<label>Password: </label>
	<input type="text" name="password" value="${userModel.password }"><br>
	<label>Address: </label>
	<input type="text" name="address" value="${userModel.address }"><br>
	<input type="submit" value="Save">
</form:form>
</body>
</html>