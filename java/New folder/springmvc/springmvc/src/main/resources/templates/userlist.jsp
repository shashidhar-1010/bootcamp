<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User List</title>
</head>
<body>
    <h2>Registered Users</h2>
    <ul>
        <c:forEach var="user" items="${users}">
            <li><c:out value="${user.username}" /></li>
        </c:forEach>
    </ul>
</body>
</html>
