<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 5/1/2019
  Time: 6:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<div class="modal-body">
    <form class="form-horizontal loginFrm">
        <div class="control-group">
            <input type="text" id="inputEmail" placeholder="Email">
        </div>
        <div class="control-group">
            <input type="password" id="inputPassword" placeholder="Password">
        </div>
        <div class="control-group">
            <label class="checkbox">
                <input type="checkbox"> Remember me
            </label>
        </div>
        <a href="register" style="color: blue">Hesabiniz yoxdursa, qeydiyyatdan kecin!</a>
    </form>
    <button type="submit" class="btn btn-success">Sign in</button>
    <button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
</div>
</body>
</html>
