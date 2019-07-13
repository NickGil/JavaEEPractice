<%--
  Created by IntelliJ IDEA.
  User: Nikita
  Date: 2019-07-13
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
<%@ page import="main.Cart" %>
 <% Cart cart = (Cart) session.getAttribute("cart");%>

<p> Наименование: <%= cart.getName()%></p>
<p> Количетсво: <%= cart.getQuantity()%></p>
</body>
</html>
