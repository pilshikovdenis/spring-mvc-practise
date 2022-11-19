<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Denis
  Date: 16.11.2022
  Time: 1:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Employee details</h1>
<%--<h3>Name: ${param.employeeName}</h3>--%>
<h3>Name: ${employee.name}</h3>
<h3>Surname: ${employee.surname}</h3>
<h3>Salary: ${employee.salary}</h3>
<h3>Department: ${employee.department}</h3>
<h3>Preferred OS: ${employee.preferredOS}</h3>
<h3>Foreign languages:
    <ul>
        <c:forEach var="lang" items="${employee.languages}">
            <li>${lang}</li>
        </c:forEach>
    </ul>
</h3>
<h3>Phone number: ${employee.phoneNumber}</h3>
<h3>Email: ${employee.email}</h3>
</body>
</html>
