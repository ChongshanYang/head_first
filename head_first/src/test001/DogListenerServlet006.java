package test001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test001Model.Dog;

public class DogListenerServlet006 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		Dog d = (Dog) getServletContext().getAttribute("dog");  //获取属性的返回值是一个Object对象，而获取参数(parameter)的返回值是String这是二者的区别之一
		String breed = d.getBreed();
		response.setContentType("text/html; charset=UTF8");  //这里加入字符编码可以解决打印中文乱码问题
		PrintWriter out = response.getWriter();
		out.println("<p>本页面是通过配置监听器设置上下文属性传递给servlet</p><br><br>");
		out.println("<p>Dog's breed is:"+ breed +"</p>");
	}
}
