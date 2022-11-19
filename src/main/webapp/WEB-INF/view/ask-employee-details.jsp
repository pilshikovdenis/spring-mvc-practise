<%--
  Created by IntelliJ IDEA.
  User: Denis
  Date: 16.11.2022
  Time: 1:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello. Please, write your details here</h1><br>

<!-- standart details form -->
<%--<form action="showDetails">--%>
<%--    <input type="text" name="employeeName" placeholder="Write your name here"/><br><br>--%>
<%--    <input type="submit" value="Confirm"/>--%>
<%--</form>--%>

<%--spring forms(use spring mvc tags)--%>
<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/><br><br>
    Surname <form:input path="surname"/><br><br>
    Salary <form:input path="salary"/><br><br>

    Department <form:select path="department">
        <form:options items = "${employee.aviableDepartments}"/>
    </form:select><br><br>

<%--    hardcoded --%>
<%--    Preferred OS <br>--%>
<%--    Linux <form:radiobutton path="preferredOS" value="Linux"/>--%>
<%--    Windows <form:radiobutton path="preferredOS" value="Windows"/>--%>
<%--    Mac OS <form:radiobutton path="preferredOS" value="Mac OS"/>--%>

    Preferred OS <form:radiobuttons path="preferredOS" items="${employee.aviableOS}"/>
    <br><br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>
