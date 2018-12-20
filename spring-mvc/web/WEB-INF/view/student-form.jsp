<%--
  Created by IntelliJ IDEA.
  User: gunaysimsek
  Date: 2018-12-20
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>

    <form:form action="processForm" modelAttribute="student">
        First name: <form:input path="firstName"></form:input>
        <br><br>
        Last name: <form:input path="lastName"></form:input>
        <br><br>
        <input type="submit" value="Submit cnms" />
    </form:form>

</body>
</html>
