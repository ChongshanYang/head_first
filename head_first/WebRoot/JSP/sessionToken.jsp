<%--
  Created by IntelliJ IDEA.
  User: yanglc
  Date: 2017/1/12
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sessionToken</title>
</head>
<body>
<form method="get" action="Servlet016">
    <input type="hidden" value="${token}" name="token"/>
    姓名：<input type="text" name="name"/><br>
    <button type="submit">提交</button>
</form>
</body>
</html>
