package test001;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Person;

public class UseJsp01Servlet007 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		HttpSession s = request.getSession();    //获得一个会话
		Person p = new Person();
		String name0 = request.getParameter("name");		//获得页面的name参数
		String name = new String(name0.getBytes("iso-8859-1"),"UTF-8");    //将页面获取的中文值转码，解决servlet获取中文值乱码问题
		System.out.println("name is："+name);
		p.setName(name);
		s.setAttribute("personBean", p);      //会话范围内的属性		
		RequestDispatcher view = request.getRequestDispatcher("../JSP/useJsp01007.jsp"); //实例化一个请求分派器，将请求分派给JSP  				
		view.forward(request, response);  //向JSP发送请求和响应
	}
}
