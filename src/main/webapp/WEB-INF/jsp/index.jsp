<%--
  Created by IntelliJ IDEA.
  User: shiva
  Date: 25-05-2020
  Time: 08:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Online Assessment - Home Page</title>
</head>
<body style="background-color: aqua;">
    <h2>Welcome to Online Assessments</h2>
    <h3>Login</h3>
    <form action="login/do" method="post">
        <label for="email">Email ID:</label>
        <input type="email" id="email" name="email" required>
        <br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <br>
        <input type="submit" id="login" value="LOGIN">
    </form>
    <label>New User?</label>
    <a href="${pageContext.request.contextPath}/register">register here</a>
</body>
</html>
