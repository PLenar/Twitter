<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add User</title>
</head>
<body>
<h3>Dodaj użytkownika</h3>
<form:f method="post" modelAttribute="user">
    <p><label>Imię: <f:input path="firstName"/></label></p>
    <p><label>Nazwisko: <f:input path="lastName"/></label></p>
    <p><label>Email: <f:input path="email"/></label></p>
    <p><label>Hasło: <f:input path="password"/></label></p>
    <input type="submit" value="Dodaj">
</form:f>
</body>
</html>
