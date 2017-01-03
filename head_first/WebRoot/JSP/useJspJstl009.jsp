<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'useJspJstl009.jsp' starting page</title>
    
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
  <%@include file="../html/public/head.jspf" %> <br>
    这个table使用定制标签库JSTL标签进行数组的遍历<br><br>
    <table border="1">
     <c:forEach var="name" items="${list}" varStatus="loopCount">   <!-- 这里的varStatus是标签自带的属性，可以再API文档中查询 --> 
     	<tr>
     		<td>循环次数：${loopCount.count}</td><td>${name}</td>
     	</tr>
     </c:forEach>
    </table>	
  <%@include file="../html/public/foot.jspf" %>  
  </body>
</html>
