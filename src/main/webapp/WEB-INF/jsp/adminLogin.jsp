<%--
  Created by IntelliJ IDEA.
  User: shiva
  Date: 25-05-2020
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Select Reports</title>
</head>
<body>
<h2 id="msg">Select Reports</h2>
<a href="${pageContext.request.contextPath}/users/all">View list of all candidates</a>
<br>
<a href="${pageContext.request.contextPath}/tests/all">View list of all tests taken</a>
<br>
<a href="${pageContext.request.contextPath}/index">Logout</a>

</body>
</html>
