<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>
<title>
    Spring MVC App
</title>
<body>
<h2>Hello <sec:authentication property="name"/>!</h2>
<a href="/addUser.html">Add user</a>
<a href="/admin/listUsers.html">List users</a>

<sec:authorize access="hasRole('ROLE_ADMIN')">
    <a class="btn btn-primary" href="hello.html">
        !!!---VIP SECTION---!!!
    </a>
</sec:authorize>

</body>
</html>