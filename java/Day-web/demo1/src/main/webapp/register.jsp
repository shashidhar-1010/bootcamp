<%@ page import="java.util.List" %>
<%@ page import="com.example.demo1.model.User" %><%--
  Created by IntelliJ IDEA.
  User: shaanant
  Date: 26-02-2024
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri ="http://java.sun.com/jsp/jstl/fmt"%>
<%--<%List<User> userlist = (List<User>)request.getAttribute("userlsit"); %>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<h1>${key}</h1>--%>
<%
    String username = null;
    Cookie[] cookies = request.getCookies();
    if(cookies!= null){
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("user")){
                username = cookie.getValue();
            }
        }
    }
%>

<h1>Hello <%=username%>,login successful!!!!!</h1>
<table>
    <c:forEach items = "${userlist}" var="user">
        <tr>
            <td>username :<c:out value="${user.getUsername()}"/></td>
            <td>password :<c:out value="${user.getPassword()}"/></td>
        </tr>
    </c:forEach>
</table>

<h2>
    <c:set var="str" value="jsp tutorial"/>
    ${fn:contains(str,"jsp" )}
</h2>

<h2>
    <c:set var="amount" value="6758.90897"/>

</h2>
<h3>

    formatted amount in indian currency:
    <fmt:setLocale value="en_IN"/>
    <fmt:formatNumber value ="${amount}" type="currency"/>
</h3>


</body>
</html>
