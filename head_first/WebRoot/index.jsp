<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
    <script type="text/javascript" src="js/snow.js"></script>
    <script type="text/javascript">
        var snow = new Snow();
    </script>
    <h>Head First!</h>
    <br><br>
    <h>你好! ${param.username} !</h>
    <li><a href="html/form.html">firstHtml（第一个servlet）</a></li>
    <li><a href="html/beerAdvice.html">beerAdvice（使用jsp打印结果）</a></li>
    <li><a href="html/downloadJar.html">downloadJar（使用servlet下载文件以及初始化参数配置）</a></li>
    <li><a href="html/servletConfigAndContext.html">initParams（servlet初始化参数以及context上下文参数配置）</a></li>
    <li><a href="html/dogServletListener.html">dogListener（使用监听器动态获取上下文参数配置）</a></li>
    <li><a href="html/useJsp01.html">useJsp01（使用JSP标准标签获取scope属性）</a></li>
    <li><a href="html/useJsp02.html">useJsp02（html页面数据直接提交到jsp，jsp使用标准动作获取参数）</a></li>
    <li><a href="html/useJsp03.html">useJsp03（jsp页面使用el表达式获取servlet放入attribute中的各类型数据）</a></li>
    <li><a href="html/useJsp04.html">useJsp04（jsp页面使用forward标准动作进行转发）</a></li>
    <li><a href="html/useJsp05.html">useJsp05（jsp页面使用JSTL<\c:forEach\>标签遍历数组）</a></li>
    <li><a href="html/useJsp06.html">useJsp06（jsp页面使用自定义标签处理数据）</a></li>
    <li><a href="html/useJsp07.html">useJsp07（jsp页面引用tag文件）</a></li>
  </body>
</html>
