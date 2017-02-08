<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yanglc
  Date: 2017/2/8
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>数据校验</title>
</head>
<body>
<s:form action="Action012">
    <s:textfield label="姓名（示例：傻逼）" name="name" ></s:textfield>
    <s:textfield label="电话（示例：18252040618）" name="mobile"></s:textfield>
    <s:textfield label="日期（示例：2017-02-02）" name="date"></s:textfield>
    <s:submit value="提交"></s:submit>
</s:form>

</body>
</html>
