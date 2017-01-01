<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'useJspForward009.jsp' starting page</title>
    
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
 		<%@include file="../html/public/head.jspf" %>   <%--.jspf格式就是jsp片段的文件格式--%>
    	这个页面用于展示使用<\jsp:forward>标签进行页面转发以及使用param标准动作实现变量在jsp页面间的传递<br><br>
    	这里是转发之前的页面，如果name值为空则不显示，否则显示这里<br>
    	<%!int count=0; %>
    	<%if(request.getParameter("name") == ""){ count++;%>
    		<jsp:forward page="useJspForward00902.jsp">
    			<jsp:param name="count" value="<%=count%>"/> 
    		</jsp:forward>
    	<%} %>
    	name is：${param.name}
    	<%count=0; %>
    	 <%@include file="../html/public/foot.jspf" %>
    	 <%--这里使用param标准动作传递变量给另一个JSP，注意格式 --%>
  </body>
</html>
