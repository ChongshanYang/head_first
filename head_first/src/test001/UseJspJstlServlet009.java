package test001;

import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UseJspJstlServlet009 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		String[] al;
		al = request.getParameterValues("list");
		System.out.println(Arrays.toString(al));
		request.setAttribute("list", Arrays.toString(al));    //传递和打印string[]数组的时候需要用这个转换一下
		RequestDispatcher view = request.getRequestDispatcher("../JSP/useJspJstl009.jsp");
		view.forward(request, response);
	}
}
