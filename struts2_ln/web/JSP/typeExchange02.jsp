<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yanglc
  Date: 2017/2/6
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>类型转换</title>
</head>
<body>
<s:form action="Action009">
    <s:textfield label="姓名" name="lists[0].name"></s:textfield>
    <s:textfield label="密码" name="lists[0].password"></s:textfield>
    <s:textfield label="年龄" name="map['first'].age"></s:textfield>
    <s:textfield label="薪水" name="map['first'].salary"></s:textfield>
    <s:submit value="提交"></s:submit>
</s:form>
</body>
</html>
