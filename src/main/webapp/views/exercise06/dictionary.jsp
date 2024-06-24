<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: huynh
  Date: 24-06-2024
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/Dictionary" method="post">
    <label for="search">Search</label>
    <input type="text" id="search" name="search"/><br>
    <input type="submit" value="Search">
</form>
<p style="color: red"><c:if test="${search=='error'}">Không tìm thấy</c:if></p>
</body>
</html>
