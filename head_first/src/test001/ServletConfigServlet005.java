package test001;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigServlet005 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		response.setContentType("text/html; charset=UTF8");  //这里加入字符编码可以解决打印中文乱码问题
		PrintWriter out = response.getWriter();
		//String param = getServletConfig().getInitParameter("initparam2");  //此方法用于从配置文件中获取初始化参数，然而这个参数只在初始化servlet时获取一次，还是要重启，并不能通过xml热部署！！！
		String type = request.getParameter("type");
		Enumeration e = getServletConfig().getInitParameterNames();   //获取多个参数名称的枚举值
		Enumeration e2 = getServletContext().getInitParameterNames();   //获取多个上下文参数名称的枚举值，注意方法名和servlet初始化参数获取的方法名不一样！

		if(type.equals("1")){
			out.println("<p>这里通过配置web.xml文件中的servlet初始化参数来配置参数值</p>");
			int i=0;
			while(e.hasMoreElements()){
				i++;
				//out.println("<br>param name = " + e.nextElement() + "<br>");
				String v = (String) e.nextElement();
				String f =  getServletConfig().getInitParameter(v);  //初始化参数实际上就是部署时的常量，只能通过这个方法获取而不能在servlet中通过方法设置
				out.println("<p>这是第"+i+"个servlet初始化参数：</p><p>参数名称："+ v +"</p><p>参数值："+ f +"</p>");	
			}
		}else{
			out.println("<p>这里通过配置web.xml文件中的上下文初始化参数来配置参数值</p>");
			int j=0;
			while(e2.hasMoreElements()){
				j++;
				String v = (String) e2.nextElement();
				String f =  getServletContext().getInitParameter(v);  //注意这里获取上下文参数方法和上面获取servlet初始化参数的方法！
				out.println("<p>这是第"+j+"个上下文初始化参数：</p><p>参数名称："+ v +"</p><p>参数值："+ f +"</p>");	
			}
		}
	}
}
