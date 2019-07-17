<%--
  Created by IntelliJ IDEA.
  User: Nikita
  Date: 2019-07-16
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>LizaProject</title>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
</head>
<body>

<c:forEach items="${complaints}" var="complaints">
    <br>
    <div class="row">
        <div class="col-md-1">${complaints.complaint} </div>
    </div>
</c:forEach>

</body>
</html>
