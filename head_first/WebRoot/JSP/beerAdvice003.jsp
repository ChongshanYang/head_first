<%@page import="java.io.PrintWriter"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'beerAdvice003.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <%@include file="../html/public/head.jspf" %>   <!--.jspf格式就是jsp片段的文件格式-->
  <body>
    	本页面用于展示servlet将结果返回时调用 JSP进行展示<br>
    	<% 
    		List ad = (List)request.getAttribute("advice");
    		Iterator it = ad.iterator();
    		while(it.hasNext()){
    			out.print("<p>advice is : "+it.next()+"</p>");
    		}
    	%>
   <%@include file="../html/public/foot.jspf" %>
  </body>
</html>
