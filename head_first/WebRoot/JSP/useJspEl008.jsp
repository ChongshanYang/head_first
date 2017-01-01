<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'useJspEl008.jsp' starting page</title>
    
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
  <%@include file="../html/public/head.jspf" %>   <!--.jspf格式就是jsp片段的文件格式-->
       这个页面使用EL表达式获取servlet设置到attribute中的各种类型属性<br><br>
       获取bean属性的name和empId属性：name=${employee.name}  empId=${employee.empId}  <br>
       获取map类型属性的键值： first=${map["first"]}  second=${map.second}  <br>
       获取list类型属性的值：  list=${list}   <br>
       获取数组类型属性的值：  array[0]=${array[0] }   array[1]=${array[1] } 
  <%@include file="../html/public/foot.jspf" %>
  </body>
</html>
