<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yanglc
  Date: 2017/1/22
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>OGNL</title>
</head>
<body>
调试：<s:debug></s:debug><br>
使用OGNL获取值栈中的name属性：<s:property value="name"/> <br>
也可以使用el表达式获取：${name}
</body>
</html>
