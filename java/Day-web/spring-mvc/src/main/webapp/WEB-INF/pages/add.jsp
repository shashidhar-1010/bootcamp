<%--
  Created by IntelliJ IDEA.
  User: shaanant
  Date: 29-02-2024
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add product</title>
</head>
<body>
<title>add product</title>
<form action="<%=request.getContextPath()%>/add" method="post" modelAttribute="product">

    <label for="prodId">Product ID:</label>
    <input type="text" id="prodId" name="prodId" required><br>

    <label for="prodName">Product Name:</label>
    <input type="text" id="prodName" name="prodName" required><br>

    <label for="proddesc">Product Description:</label>
    <input id="prodDesc" name="prodDesc" rows="2" required><br>

    <label for="price">Price:</label>
    <input type="text" id="price" name="price" required><br>

    <input type="submit" value="Add Product">


</form>

</body>
</html>
