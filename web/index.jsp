<%--
  Created by IntelliJ IDEA.
  User: Nikita
  Date: 2019-07-15
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>LizaProject</title>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
</head>
<body>
<form class="form-horizontal" action="do?command=index" method="POST">
    <fieldset>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="appeal">Input</label>
            <div class="col-md-4">
                <input id="appeal" name="complaint" value="" type="text" placeholder="" class="form-control input-md"
                       required="">

            </div>
        </div>

        <!-- Button -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="singlebutton"></label>
            <div class="col-md-4">
                <button id="singlebutton" name="singlebutton" class="btn btn-success">Send</button>
            </div>
        </div>

    </fieldset>
</form>

</body>
</html>
