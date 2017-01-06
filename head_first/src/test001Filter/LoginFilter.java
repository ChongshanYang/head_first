package test001Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		 // 获得在下面代码中要用的request,response,session对象
		  HttpServletRequest servletRequest = (HttpServletRequest) request;
		  HttpServletResponse servletResponse = (HttpServletResponse) response;
		  HttpSession session = servletRequest.getSession();
		  // 获得用户请求的URI
		  String path = servletRequest.getRequestURI();
		  //System.out.println(path);
		  // 从session里取员工工号信息
		  String empId = (String) session.getAttribute("username");
		  System.out.println("username is:"+ empId);
		  /*创建类Constants.java，里面写的是无需过滤的页面
		  for (int i = 0; i < Constants.NoFilter_Pages.length; i++) {
		   if (path.indexOf(Constants.NoFilter_Pages[i]) > -1) {
		    chain.doFilter(servletRequest, servletResponse);
		    return;
		   }
		  }*/
		  // 登陆页面无需过滤
		  if(path.indexOf("/login.jsp") > -1) {
		   chain.doFilter(servletRequest, servletResponse);
		   return;
		  }
		  // 判断如果没有取到员工信息,就跳转到登陆页面
		  if (empId == null || "".equals(empId)) {
		   // 跳转到登陆页面
		   servletResponse.sendRedirect("/head_first/login.jsp");
		  } else {
		   // 已经登陆,继续此次请求
		   chain.doFilter(request, response);
		  }
		// pass the request along the filter chain
		//chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
