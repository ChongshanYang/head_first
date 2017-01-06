package test001Filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.User;

@WebFilter("/FilterStation")
public class LoginFilter extends HttpServlet implements Filter {
	private FilterConfig filterConfig;
	public LoginFilter() {
		super();
	}
	
	public void destroy() {
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpSession session=((HttpServletRequest)request).getSession();
		response.setCharacterEncoding("utf-8");
		User user = (User) session.getAttribute("user");
		//System.out.println("用户登录名:"+user.getUsername());
		if(user==null){
			PrintWriter out=response.getWriter();			
			out.print("<script>location.href='/head_first/login.jsp'</script>");
		}
		else{
			System.out.println("用户登录名:"+user.getUsername());
			// pass the request along the filter chain
			chain.doFilter(request, response);
		}
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
	// TODO Auto-generated method stub
	this.filterConfig=fConfig;
	}
}