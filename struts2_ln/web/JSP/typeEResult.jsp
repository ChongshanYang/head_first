<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yanglc
  Date: 2017/2/6
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>类型转换结果</title>
</head>
<body>
    姓名：<s:property value="name"></s:property><br>
    密码：<s:property value="password"></s:property><br>
    年龄：<s:property value="p.age"></s:property><br>
    薪水：<s:property value="p.salary"></s:property>
</body>
</html>
