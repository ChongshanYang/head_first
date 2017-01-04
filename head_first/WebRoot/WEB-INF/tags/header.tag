<%@attribute name="fontColor" required="true" %>     <!-- 这里设置标签的属性值，跟tld配置文件类似 -->
<%@ tag body-content="scriptless" %>    <!-- 这里设置的是标签体内容的格式 ,默认是scriptless-->
<img src="/head_first/images/head.jpg"><br>
<em><strong><font color="fontColor"><jsp:doBody/></font></strong></em>    <!-- 用<jsp:doBody/>来获取标签体的内容 -->