<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Twitter</title>
</head>
<body>

<form:f method="post" modelAttribute="tweet">
    <p><label>Text <f:input path="text"/></label></p>
    <input type="submit" value="Tweetnij">
</form:f>

<c:forEach items="${tweets}" var="tweet">
<p>${tweet.user.firstName} ${tweet.user.lastName} ${tweet.created} <br>
    ${tweet.text}<br></p>
</c:forEach>
</body>
</html>
