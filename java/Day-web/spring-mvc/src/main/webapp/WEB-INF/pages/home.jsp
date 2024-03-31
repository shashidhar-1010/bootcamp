<%@ page import="com.training.springmvc.model.product" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<head>
    <title>Home Page</title>
</head>
<body>

    <h1>hello from jsp!!!</h1>
    <hr>
    <% List<product> productList =(List<product>) request.getAttribute("prodList");
    %>
    <h2><%= productList.get(0).getProdName()%></h2>




    <p>This is a simple home page created using JSP.</p>

</body>
</html>