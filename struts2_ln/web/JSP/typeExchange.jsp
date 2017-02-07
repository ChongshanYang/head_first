<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yanglc
  Date: 2017/2/6
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>类型转换器</title>
</head>
<body>
使用struts2自带的类型转换器对jsp数据类型进行转换（注意使用了OGNL表达式和struts标签）<br>
后面要对这样的带有非String类型的数据输入进行校验操作<br>
具体效果可以看后台<br>
<s:form action="Action008">
    <s:textfield label="姓名" name="name"></s:textfield>
    <s:textfield label="密码" name="password"></s:textfield>
    <s:textfield label="年龄" name="p.age"></s:textfield>
    <s:textfield label="薪水" name="p.salary"></s:textfield>
    <s:submit value="提交"></s:submit>
</s:form>
</body>
</html>
