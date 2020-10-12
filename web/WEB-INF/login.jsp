<%-- 
    Document   : login
    Created on : Oct 11, 2020, 8:32:58 PM
    Author     : 831892
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="POST">
            <label>${message}</label><br>
            <label>Username: </label><input type="text" name="username" value="${uname}"><br>
            <label>Password: </label><input type="password" name="password" value="${pswd}"><br>
            <input type="submit" value="Log in">
        </form>
    </body>
</html>
