<%--
  Created by IntelliJ IDEA.
  User: gunaysimsek
  Date: 2018-12-20
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Confirmation Form</title>
</head>
<body>

The customer is confirmed: ${customer.firstName}

<br>Last Name:${customer.lastName}
<%--<br>Country:${student.country}--%>
<%--<br>Favorite Language:${student.favoriteLanguage}--%>
<%--<br>Operating Systems:--%>
<%--<ul>--%>
    <%--<c:forEach var = "temp" items ="${student.operatingSystems}">--%>
        <%--<li>${temp}</li>--%>
    <%--</c:forEach>--%>
<%--</ul>--%>

</body>
</html>
