<%@page import="dao.Person"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'useJsp01007.jsp' starting page</title>
    
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
    	这个页面是使用标准动作获取参数的示例 <br><br>
    	<%!Person p = new Person(); %>      <!--声明全局变量的表达式  -->开头使用!Person p = new Person(); 方式声明全局变量  <br><br>
    	这里使用java脚本获取session属性得到页面参数(pageContext.getAttribute("personBean",PageContext.SESSION_SCOPE)方法)：<br>
    	<% p = (Person)pageContext.getAttribute("personBean",PageContext.SESSION_SCOPE);%>
    		name is:<%=p.getName() %><br>
    	这里使用java脚本获取session属性得到页面参数(session.getAttribute("personBean")方法)：<br>
    	<% p = (Person)session.getAttribute("personBean"); %>
    		name is:<%=p.getName() %><br>
    	这里使用java脚本获取session属性得到页面参数(pageContext.findAttribute("personBean")方法)：<br>
    	<% p = (Person)pageContext.findAttribute("personBean");%>
    	name is:<%=p.getName() %><br><br>
    	这里使用JSP标准动作标签获取参数(useBean和getProperty标签)：
    	<jsp:useBean id="personBean" class="dao.Person" scope="session"/>
    	name is :<jsp:getProperty name="personBean" property="name"/>

    	这里使用bean标签创建一个新的bean属性并给property赋值，将setProperty放在bean标签体中时，当且仅当这个bean是由本jsp自己新建的时候，设置才会生效，在能获取bean属性的情况下设置不生效<br>
    	<jsp:useBean id="newBean" class="dao.Person" >
    		<jsp:setProperty name="newBean" property="name" value="jsp设置的名称"/>
    	</jsp:useBean>
    	jsp 设置的name is：<jsp:getProperty name="newBean" property="name"/>
    	<%@include file="../html/public/foot.jspf" %>
  </body>
</html>
