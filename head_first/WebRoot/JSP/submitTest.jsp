<%--
  Created by IntelliJ IDEA.
  User: yanglc
  Date: 2017/1/12
  Time: 9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>防止重复提交</title>
</head>
<body>
<form method="get" action="Servlet014" onsubmit="return doSbmit01()">
    姓名：<input type="text" name="name"/><br>
    <input type="submit" value="提交" id="submit"/>
</form>
<script>
    function doSbmit01(){             //此方法用于在页面防止重复提交
        var isSubmit = false;
        if(isSubmit == false){      //第一次提交的时候这个值是false
            isSubmit = true;
            return true;
        }else{                      //之后的提交这个值都会被值为true
            return false;
        }
    }
    function doSbmit02(){           //此方法保证页面在提交按钮点击之后被置为不可点击，以此防止重复提交
        //获取表单提交按钮
        var btnSubmit = document.getElementById("submit");
        //将表单提交按钮设置为不可用，这样就可以避免用户再次点击提交按钮
        btnSubmit.disabled= "disabled";
        //返回true让表单可以正常提交
        return true;
    }
</script>
</body>
</html>
