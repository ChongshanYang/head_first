package test001;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.http.HTTPException;

import test001Model.BeerAdvice;

public class Servlet002 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, HTTPException{
		String color  = request.getParameter("color");
		System.out.println("color is" + " "+color);
		response.setContentType("text/html; charset=UTF8");  //这里加入字符编码可以解决打印中文乱码问题
		PrintWriter out = response.getWriter();
		out.println("<p>此页面显示后台返回的model生成数据</p>");
		out.println("<p>"+color+"</p>");
		BeerAdvice ba = new BeerAdvice();
		List ad = ba.getAdvice(color);
		Iterator it = ad.iterator();
		while(it.hasNext()){
			out.println("<p>advice is : "+it.next()+"</p>");
		}
	}
}
