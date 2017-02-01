<%--
  Created by IntelliJ IDEA.
  User: yanglc
  Date: 2017/2/1
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>interceptorLink</title>
</head>
<body>
以下三个链接访问时会被通过继承MethodFilterInterceptor类实现的拦截器有选择性地拦截，通过配置，方法m1将被拦截，而m2、m3则不会被拦截，具体效果看后台
<a href="<%=request.getContextPath()%>/Intercepted_m1.action">m1</a><br>
<a href="<%=request.getContextPath()%>/Intercepted_m2.action">m2</a><br>
<a href="<%=request.getContextPath()%>/Intercepted_m3.action">m3</a><br>

</body>
</html>
