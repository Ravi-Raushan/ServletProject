<%--
  Created by IntelliJ IDEA.
  User: Ravi Raushan
  Date: 19-04-2020
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Successful</title>
</head>
<body>
<h3>Hi <%= request.getParameter("name") %>, Registration Successful. </h3>
<a href="Login.html"> Login</a>
</body>
</html>
