<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <title>登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	请登录，用户名随便填，密码默认都是123 <br><br>
		   <form class="form-horizontal" role="form" method="get" action="Action001.action">
		   <div class="form-group">
			   <label for="firstname" class="col-sm-2 control-label">用户名</label>
			   <div class="col-xs-4">
				   <input type="text" class="form-control" id="firstname" name="name"
						  placeholder="请输入用户名">
			   </div>
		   </div>
		   <div class="form-group">
			   <label for="lastname" class="col-sm-2 control-label">密码</label>
			   <div class="col-xs-4">
				   <input type="text" class="form-control" id="lastname" name="password"
						  placeholder="请输入密码">
			   </div>
		   </div>
		   <div class="form-group">
			   <div class="col-sm-offset-2 col-sm-10">
				   <div class="checkbox">
					   <label>
						   <input type="checkbox"> 请记住我
					   </label>
				   </div>
			   </div>
		   </div>
		   <div class="form-group">
			   <div class="col-sm-offset-2 col-sm-10">
				   <button type="submit" class="btn btn-default">登录</button>
			   </div>
		   </div>
			   <s:token></s:token><!--这里需使用token标签，这样页面就会自动生成一个token令牌，防止重复提交-->
	   </form>
  </body>
</html>
