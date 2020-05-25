<%--
  Created by IntelliJ IDEA.
  User: shiva
  Date: 26-05-2020
  Time: 03:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring Assessment</title>
</head>
<body style="background-color: aqua;">
<h1>Spring Assessment</h1>
<form action="evaluate/spring/test" method="post">
    <br><label><b>Question 1: What is Spring?</b></label><br>
    <input type="radio" id="Q1-Opt1" name="Question1" value="J2EE App Server" />
    <label for="Q1-Opt1">J2EE App Server</label><br>
    <input type="radio" id="Q1-Opt2" name="Question1" value="J2EE App Development Framework" />
    <label for="Q1-Opt2">J2EE App Development Framework</label><br>
    <input type="radio" id="Q1-Opt3" name="Question1" value="Configuration Management Tool" />
    <label for="Q1-Opt3">Configuration Management Tool</label><br>
    <input type="radio" id="Q1-Opt4" name="Question1" value="Build Tool" />
    <label for="Q1-Opt4">Build Tool</label><br>

    <br><label><b>Question 2: What is the full form of IOC?</b></label><br>
    <input type="radio" id="Q2-Opt1" name="Question2" value="Inversion of Control" />
    <label for="Q2-Opt1">Inversion of Control</label><br>
    <input type="radio" id="Q2-Opt2" name="Question2" value="Interjection of Control" />
    <label for="Q2-Opt2">Interjection of Control</label><br>
    <input type="radio" id="Q2-Opt3" name="Question2" value="Internal Object Control" />
    <label for="Q2-Opt3">Internal Object Control</label><br>
    <input type="radio" id="Q2-Opt4" name="Question2" value="In-built Object Control" />
    <label for="Q2-Opt4">In-built Object Control</label><br>

    <br><label><b>Question 3: What is the full form of AOP?</b></label><br>
    <input type="radio" id="Q3-Opt1" name="Question3" value="Anticipation Of Properties" />
    <label for="Q3-Opt1">Anticipation Of Properties</label><br>
    <input type="radio" id="Q3-Opt2" name="Question3" value="Aspect Oriented Programming" />
    <label for="Q3-Opt2">Aspect Oriented Programming</label><br>
    <input type="radio" id="Q3-Opt3" name="Question3" value="Associated Object Programming" />
    <label for="Q3-Opt3">Associated Object Programming</label><br>
    <input type="radio" id="Q3-Opt4" name="Question3" value="Anti Object Programming" />
    <label for="Q3-Opt4">Anti Object Programming</label><br>

    <br><label><b>Question 4: Which of the below is a Spring Container?</b></label><br>
    <input type="radio" id="Q4-Opt1" name="Question4" value="View Resolver" />
    <label for="Q4-Opt1">View Resolver</label><br>
    <input type="radio" id="Q4-Opt2" name="Question4" value="Application Context" />
    <label for="Q4-Opt2">Application Context</label><br>
    <input type="radio" id="Q4-Opt3" name="Question4" value="Handler Mapping" />
    <label for="Q4-Opt3">Handler Mapping</label><br>
    <input type="radio" id="Q4-Opt4" name="Question4" value="Dispatcher Servlet" />
    <label for="Q4-Opt4">Dispatcher Servlet</label><br>

    <br><label><b>Question 5: Which is Spring's Front Controller Implementation?</b></label><br>
    <input type="radio" id="Q5-Opt1" name="Question5" value="Bean Factory" />
    <label for="Q5-Opt1">Bean Factory</label><br>
    <input type="radio" id="Q5-Opt2" name="Question5" value="Class Path Application Context" />
    <label for="Q5-Opt2">Class Path Application Context</label><br>
    <input type="radio" id="Q5-Opt3" name="Question5" value="Application Context" />
    <label for="Q5-Opt3">Application Context</label><br>
    <input type="radio" id="Q5-Opt4" name="Question5" value="Dispatcher Servlet" />
    <label for="Q5-Opt4">Dispatcher Servlet</label><br>

    <input type="submit" id="submitspring" value="Submit Test" />
</form>


</body>
</html>