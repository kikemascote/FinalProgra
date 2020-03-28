<%-- Created by IntelliJ IDEA. --%>
<%--
    Document   : LoginPage
    Created on : 25 mar 2020, 21:35:25
    Author     : Kike
--%>

<%@ page language="java"
         contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
    <link rel="stylesheet" href="style.css"/>
    <title>Login</title>
</head>

<body>
<h1 class="animated" align="center">Biblioteca</h1>

<div class="container" align="center">
    <form  action="LoginServlet"><br>
        <label>Introduce nombre de usuario</label><br>
        <input type="text" name="uname"><br>
        <label>Introduce el passguord</label><br>
        <input type="password" name="passwd">
        <br><br>
        <button type="submit">loguiar</button>

    </form>
</div>
</body>
</html>