<%--
  Created by IntelliJ IDEA.
  User: huynh
  Date: 23-06-2024
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form action="<%=request.getContextPath()%>/CaculatorServlet" method="post">
    <label for="firstOperand">First Operand</label>
    <input type="number" id="firstOperand" name="firstOperand"/><br>

    <label>Operator</label>
    <select name="operator" id="operator">
      <option value="Addition">Addition</option>
      <option value="Subtraction">Subtraction</option>
      <option value="Multiplication">Multiplication</option>
      <option value="Division">Division</option>
      <option value="Percent">Percent</option>
    </select><br>

    <label for="secondOperand">Second Operand</label>
    <input type="number" id="secondOperand" name="secondOperand"/><br>

    <input type="submit" value="Calculate"/>
  </form>
</body>
</html>
