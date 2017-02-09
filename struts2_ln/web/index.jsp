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
  <li><a href="JSP/typeExchange.jsp">使用struts2自带的类型转换器对jsp数据类型进行转换（具体效果看后台）</a></li>
  <li><a href="JSP/typeExchange02.jsp">使用struts2自带的类型转换器对jsp数据类型进行转换（list和map类型的传递）</a></li>
  <li><a href="JSP/typeExchange03.jsp">使用自定义的类型转换器对jsp数据类型进行转换（String和Person类型相互转换）</a></li>
  <li><a href="JSP/validation01.jsp">为action配置校验文件，进行表单参数校验</a></li>
  <li><a href="JSP/validation02.jsp">在action中重写validate()方法，自定义校验器进行表单参数校验</a></li>
  <li><a href="JSP/uploadFile.jsp">在jsp表单中添加file标签，实现文件上传</a></li>
  <li><a href="JSP/download.jsp">文件下载（也可以在文件上传的结果页面下载）</a></li>
  <s:token></s:token><!--这里需使用token标签，这样页面就会自动生成一个token令牌，防止重复提交-->
  </body>
</html>
