package test001;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Employee;
import dao.Person;

public class UseJspElServlet008 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		Employee p = new Employee();
		String name = new String((request.getParameter("name")).getBytes("iso-8859-1"),"UTF-8");
		int empId = Integer.parseInt(request.getParameter("empId"));
		p.setName(name);
		p.setEmpId(empId);
		request.setAttribute("employee", p);//向属性中添加bean类型
		
		HashMap<String, Object> m = new HashMap<String, Object>();
		m.put("first", "first");
		m.put("second","second");
		request.setAttribute("map", m);//向属性中添加map类型
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("list001");
		l.add("list002");
		request.setAttribute("list", l);//向属性中添加list类型
		
		String[] a = {"array001","array002"};
		request.setAttribute("array", a);//向属性中添加array类型
		
		RequestDispatcher view = request.getRequestDispatcher("../JSP/useJspEl008.jsp"); //实例化一个请求分派器，将请求分派给JSP  				
		view.forward(request, response);  //向JSP发送请求和响应
	}
}
