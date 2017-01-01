package test001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.mail.iap.Response;

public class Servlet001 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException ,IOException{
		String color  = request.getParameter("color");
		System.out.println("color is" + " "+color);
		response.setContentType("text/html;charset=UTF8"); //这里加入字符编码可以解决打印中文乱码问题
		PrintWriter out = response.getWriter();
		out.println("<p>此页面用于展示通过servlet的get方法获取和打印前台页面数据</p>");
		out.println("<p>"+color+"</p>");
	}
}
