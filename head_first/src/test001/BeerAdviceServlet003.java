package test001;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test001Model.BeerAdvice;

public class BeerAdviceServlet003 extends HttpServlet{
	@Override	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BeerAdvice ba = new BeerAdvice();
		String color = request.getParameter("color");
		List ad = ba.getAdvice(color);
		request.setAttribute("advice", ad);    //为请求添加属性，转交给JSP
		//这里通过使用request获取路径，可以使用相对路径
		//RequestDispatcher view = request.getRequestDispatcher("../JSP/beerAdvice003.jsp"); //实例化一个请求分派器，将请求分派给JSP  				
		
		//这里通过servletContext获取路径，这里不能使用相对路径，必须使用绝对路径，即开头必须有"/"斜杠代表应用根目录
		RequestDispatcher view = getServletContext().getRequestDispatcher("/JSP/beerAdvice003.jsp");
		view.forward(request, response);  //向JSP发送请求和响应
		}
}
