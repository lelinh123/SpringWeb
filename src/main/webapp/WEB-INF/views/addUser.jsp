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
<form:form method="POST" action="/addUser" modelAttribute="userModel">

	<label>Username: </label>
	<input type="text" id="username" name="username"><span style="color:red">${errorUsername }</span><br>
	<label>Password: </label>
	<input type="text" id="password" name="password"><br>
	<label>Address: </label>
	<input type="text" id="address" name="address"><br>
	<input type="submit" value="Save">
</form:form>
</body>
</html>