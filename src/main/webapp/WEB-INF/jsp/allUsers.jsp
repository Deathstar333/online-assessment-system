<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: shiva
  Date: 25-05-2020
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All User Details</title>
    <style>
        table, th, td {
            border: 1px solid black;
        }
    </style>
</head>
<body style="background-color: aqua;">
<h2>List of All Users</h2>
<table>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email ID</th>
        <th>User Type</th>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td><c:out value="${user.firstName}" /></td>
            <td><c:out value="${user.lastName}" /></td>
            <td><c:out value="${user.email}" /></td>
            <td><c:out value="${user.userType}" /></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
