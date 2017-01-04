<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="m" tagdir="/WEB-INF/tags" %>    <!-- 通过tagdir获取tag所在目录，这里必须将tag文件放在/WEB-INF/tags目录下，否则会报错-->
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'useJspTagFile.jsp' starting page</title>
    
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
    这个页面引用了一个tag标签内容<br><br>
  <m:header fontColor="#660099">
  	在标记文件的体中不能使用脚本代码，body-content默认为"scriptless"，
  	另外有"empty"什么都没有、"tagdependent"将体内容看做纯文本。可以不定义body-content。 
  	不过可以使用EL表达式：${param.name}
  </m:header>
  <%@include file="../html/public/foot.jspf" %>  
  </body>
</html>
