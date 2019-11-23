<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Log in</title>
</head>
<body>
<form:f method="post">
    <p><label>Email: <f:input path="email"/></label></p>
    <p><label>Hasło: <f:input path="password"/></label></p>
    <input type="submit" value="Log in">
</form:f>
</body>
</html>
