<!DOCTYPE>
<html>
<head>
    <title>Welcome to my site</title>

    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/css/my-test.css">

    <script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
</head>

<body>

<h2>Spring MVC Demo - Home Page </h2>

<hr>

<a href="hello/showForm">Hello World form</a>
<br>
<br>
<img src="${pageContext.request.contextPath}/resources/images/jaguar.jpg">

<br>
<input type="button" onclick="doSomeWork()" value="Click Me"/>

<br>

<a href="student/showForm"> Student Form</a>
</body>

</html>