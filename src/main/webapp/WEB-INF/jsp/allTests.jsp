<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: shiva
  Date: 26-05-2020
  Time: 03:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Test Details</title>
    <style>
        table, th, td {
            border: 1px solid black;
        }
    </style>
</head>
<body style="background-color: aqua;">
<h2>List of Candidates and Tests</h2>
<table>
    <tr>
        <th>Test Date</th>
        <th>Assessment</th>
        <th>Test Marks</th>
        <th>Email ID</th>
        <th>Total Marks</th>
        <th>Result</th>
    </tr>
    <c:forEach items="${testList}" var="test">
        <tr>
            <td><c:out value="${test.testDate}" /></td>
            <td><c:out value="${test.assessment}" /></td>
            <td><c:out value="${test.testMarks}" /></td>
            <td><c:out value="${test.emailId}" /></td>
            <td><c:out value="${test.totalMarks}" /></td>
            <td><c:out value="${test.result}" /></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
