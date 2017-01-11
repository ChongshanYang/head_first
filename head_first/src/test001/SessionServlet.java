package test001;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by yanglc on 2017/1/11.
 */
public class SessionServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        String name = request.getParameter("name");
        HttpSession session = request.getSession();
        session.setAttribute("name",name);
        String sessionId = session.getId();
        if(session.isNew()){
            response.getWriter().print("新建session，sessionId ="+ sessionId +" "+"用户姓名为:"+ session.getAttribute("name"));
        }else{
            response.getWriter().print("session已存在，sessionId = "+ sessionId);
        }
    }
}
