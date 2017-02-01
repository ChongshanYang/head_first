package test002Filter;

import Dao.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by yanglc on 2017/1/13.
 */
@WebFilter(filterName = "LoginFilter")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpSession session=((HttpServletRequest)req).getSession();
        resp.setCharacterEncoding("utf-8");
        User user = (User) session.getAttribute("user");
        if(user==null){
            PrintWriter out=resp.getWriter();
            out.print("<script>location.href='/struts2/login.jsp'</script>");
        }
        else{
            System.out.println("用户登录名:"+user.getName());
            // pass the request along the filter chain
            chain.doFilter(req, resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
