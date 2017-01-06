<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
       请登录，用户名随便填，密码默认都是123<br><br>
	用户名和密码在loginServlet中进行验证，而过滤器filter检查用户名是否为空，若不为空则返回登录页面要求登录<br><br>
    <form method="get" action="Servlet010">
    	userName:<input type="text" name="username"><br>
    	passWord:<input type="text" name="password"><br>
    	<input type="submit" >
    </form>
  </body>
</html>
