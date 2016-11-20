<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>List users</title>
</head>
<body>
<h1>Users</h1>

<table>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.name}</td>
            <td>${user.gender}</td>
            <td>${user.school}</td>
            <td>${user.colors}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>