<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: huynh
  Date: 25-06-2024
  Time: 01:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/LoginServlet" method="post">
    <label for="userName">Username</label>
    <input type="text" name="userName" id="userName"/><br>
    <label for="password">Password</label>
    <input type="password" name="password" id="password"/><br>
    <input type="submit" value="login"/>
</form>
<p style="color: red"><c:if test="${result=='error'}">Tài khoản hoặc mật khẩu không chính xác</c:if></p>
</body>
</html>