<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "registration page!" %>

</h1>
<br/>
<%--<a href="hello-servlet">Hello Servlet</a>--%>

<form action=<%=request.getContextPath()%>/registration method="post">
    Username:<input type="text" name = "username" placeholder="enter your name"><br>
    <br>
    password:<input type="password" name="pwd" placeholder="enter password"><br><br>
    <input type="submit" value = "Register">

</form>
</body>
</html>

<%--
jsp objects:::
1.request
2.response
3.out
4.session
5.application
6.config
7.pageaContext
8.pageobject(this)
9.exception
--%>