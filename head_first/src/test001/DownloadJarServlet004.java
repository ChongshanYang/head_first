package test001;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadJarServlet004 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("application/jar");
		response.addHeader("Content-Disposition","attachment; filename="+"test.jar"+"");   //设置下载的文件名
		ServletContext ctx = getServletContext();
		InputStream is  = ctx.getResourceAsStream("/download/test.jar");    //获取下载流数据
		
		int read = 0;
		byte[] bytes = new byte[1024];
		
		OutputStream os = response.getOutputStream();
		while((read = is.read(bytes))!= -1){
			os.write(bytes,0,read);
		}
		os.flush();
		os.close();		

	}
	
	//使用post方法测试下servlet初始化参数
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{		
		response.setContentType("text/html; charset=UTF8");  //这里加入字符编码可以解决打印中文乱码问题
		PrintWriter out = response.getWriter();
		String param = getServletConfig().getInitParameter("initparam");  //此方法用于从配置文件中获取初始化参数，然而这个参数只在初始化servlet时获取一次，还是要重启，并不能通过xml热部署！！！
		out.println("<p>这里通过配置web.xml文件中的初始化参数来配置参数值</p><p>可配置的初始化参数：</p><p>"+ param +"</p>");	
	}

}
