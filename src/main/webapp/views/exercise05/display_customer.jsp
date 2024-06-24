<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: This MC
  Date: 21/06/2024
  Time: 8:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Customer</title>
</head>
<body>
<table border="1">
    <thead>
    <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listCustomers}" var="customer">
        <tr>
            <td>${customer.customerName}</td>
            <td>${customer.birthDate}</td>
            <td>${customer.address}</td>
            <td><img src="${customer.imageUrl}" width="100px" height="100px"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>