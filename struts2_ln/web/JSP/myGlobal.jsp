<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yanglc
  Date: 2017/1/18
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>globalException</title>
</head>
<body>
输出异常信息本身，throw出来自己写的信息:<br>
<s:property value="exception"/><br>

输出异常堆栈信息，很多的详细信息:<br>
<s:property value="exceptionStack"/>
</body>
</html>
