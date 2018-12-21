<%--
  Created by IntelliJ IDEA.
  User: gunaysimsek
  Date: 2018-12-21
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>Customer Registration Form</title>
    <style>
        .error {color:darkred}
    </style>
</head>
<body>

<form:form action="processForm" modelAttribute="customer">
    First name: <form:input path="firstName"></form:input>
    <br><br>
    Last name (*): <form:input path="lastName"></form:input>
    <form:errors path="lastName" cssClass="error"></form:errors>

    <br><br>
    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>
