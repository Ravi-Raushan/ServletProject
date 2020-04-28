<%--
  Created by IntelliJ IDEA.
  User: Ravi Raushan
  Date: 17-04-2020
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html charset=US-ASCII">
<title>Login Success Page</title>
</head>
<body>
<h3>Hi <%= request.getAttribute("user") %>, Login Successful. </h3>
<a href="Login.html">Logout</a>
</body>
</html>
