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
        Country:
        <form:select path="country">
            <form:options items="${theCountryOptions}" ></form:options>
        </form:select>
        <br><br>
        Favorite Language:
        Java <form:radiobutton path="favoriteLanguage" value="Java"></form:radiobutton>
        C <form:radiobutton path="favoriteLanguage" value="C"></form:radiobutton>
        PHP <form:radiobutton path="favoriteLanguage" value="PHP"></form:radiobutton>
        Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"></form:radiobutton>
        <br><br>
        Operating Systems:
        <form:checkboxes path="operatingSystems" items="${osOptions}"></form:checkboxes>
        <br><br>

        <input type="submit" value="Submit cnms" />
    </form:form>



</body>
</html>
