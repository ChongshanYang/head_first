<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'useJsp02.jsp' starting page</title>
    
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
    使用脚本获取参数：<br>
    <jsp:useBean id="person" type="dao.Person" class="dao.Employee">
    	<jsp:setProperty name="person" property="name" value="<%=request.getParameter(\"name\") %>"/>    <!--这里的引号必须使用转义字符，否则会因为tomcat的机制而报错-->
    </jsp:useBean>
    使用脚本<\%=request.getParameter("name") %>获取到name值:<br> name=<jsp:getProperty name="person" property="name"/><br><br>
    
   
  使用param属性获取对应的参数值：<br>
    <jsp:useBean id="person2" type="dao.Person" class="dao.Employee">
    	<jsp:setProperty name="person2" property="name" param="name"/>
    </jsp:useBean> 
  使用param属性param="name"获取name值:<br>name=<jsp:getProperty name="person2" property="name"/><br><br>	
  
  如果参数名称和bean中相同，可以省略掉param参数，直接取得：<br>
    <jsp:useBean id="person3" type="dao.Person" class="dao.Employee">
    	<jsp:setProperty name="person3" property="empId"/>
    </jsp:useBean> 
  不使用param属性param="empId"直接获取empId值:<br>empId=<jsp:getProperty name="person3" property="empId"/><br><br>
  
  获取所有参数：<br>
    <jsp:useBean id="person4" type="dao.Employee" class="dao.Employee">    <!--如果传入的参数在bean类中为非String类型，那么useBean标签的type属性必须为具体类而不能使用多态，否则类型无法转换-->
    	<jsp:setProperty name="person4" property="*"/>
    </jsp:useBean> 
 使用适配符获取到所有参数：<br>name=<jsp:getProperty name="person4" property="name"/>  empId=<jsp:getProperty name="person4" property="empId"/> empName=<jsp:getProperty name="person4" property="empName"/>
<%@include file="../html/public/foot.jspf" %>
  </body>
</html>
