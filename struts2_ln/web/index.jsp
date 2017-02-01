<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yanglc
  Date: 2017/1/13
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>主页</title>
  </head>
  <body>
  你好！${param.name}<br>
  <li><a href="login.jsp">使用action进行登录验证</a></li>
  <li><a href="html/CRUD.html">通过在struts配置文件中配置method属性，调用一个action中的不同方法</a></li>
  <li><a href="html/exception.html">配置result及exception属性，处理action抛出的异常</a></li>
  <li><a href="html/scope.html">action中获取scope对象</a></li>
  <li><a href="html/OGNL001.html">JSP使用OGNL获取属性值</a></li>
  <li><a href="JSP/interceptorLink.jsp">拦截器灵活访问action中的方法</a></li>
  <li><a href="annoAction.action">使用struts2自带的注解拦截器监控注解方法（具体效果看后台）</a></li>

  </body>
</html>
