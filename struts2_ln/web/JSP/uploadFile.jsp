<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yanglc
  Date: 2017/2/9
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<s:form method="POST" action="Action013" enctype="multipart/form-data">
    <s:file name="upload" label="上传"></s:file>
    <s:submit value="上传"></s:submit>
</s:form>
</body>
</html>
