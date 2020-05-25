<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: shiva
  Date: 25-05-2020
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>
</head>
<body style="background-color: aqua">
<h2>Registration</h2>
<br>
<br>
<table>
    <form action="registration/do" method="post">
        <tr>
            <td><label for="firstname">First Name: </label></td>
            <td><input type="text" id="firstname" name="firstname" pattern="[a-zA-Z]+" title="1 or more alphabets only" required /></td>
        </tr>
        <tr>
            <td><label for="lastname">Last Name: </label></td>
            <td><input type="text" id="lastname" name="lastname" pattern="[a-zA-Z]+" title="1 or more alphabets only" required /></td>
        </tr>
        <tr>
            <td><label for="email">Email ID: </label></td>
            <td><input type="email" id="email" name="email" /></td>
        </tr>
        <tr>
            <td><label for="password">Password: </label></td>
            <td><input type="password" id="password" name="password" minlength="8"></td>
        </tr>
        <tr>
            <td><input type="submit" id="register" value="REGISTER"></td>
            <td></td>
        </tr>
    </form>
</table>

</body>
</html>
