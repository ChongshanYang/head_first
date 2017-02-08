<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yanglc
  Date: 2017/2/8
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>参数校验</title>
</head>
<body>
<s:form action="Action011">
    <s:textfield label="姓名(String，示例：傻逼)" name="name"></s:textfield>
    <s:textfield label="年龄（int，示例：23）" name="age"></s:textfield>
    <s:textfield label="日期(Date， 示例：2017-02-02)" name="date"></s:textfield>
    <s:submit value="提交"></s:submit>
</s:form>
<s:fielderror></s:fielderror>
</body>
</html>
