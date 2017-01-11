<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yanglc
  Date: 2017/1/11
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>cart</title>
</head>
<body>
<%@include file="../html/public/head.jspf" %> <br>
这个table使用定制标签库JSTL标签进行对象list的遍历，点击返回重新选择，可以增加购物车内容（使用session存储用户信息）<br><br>
购物车：<br>
<c:forEach var="book" items="${list}" >
    <tr>
        <td>${book.name}</td><br>
    </tr>
</c:forEach>
<%@include file="../html/public/foot.jspf" %>
</body>
</html>
