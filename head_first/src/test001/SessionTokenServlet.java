package test001;

import tools.TokenProccessor;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by yanglc on 2017/1/12.
 */
@WebServlet(name = "SessionTokenServlet")
public class SessionTokenServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String token = TokenProccessor.getInstance().makeToken();  //创建令牌
        System.out.println("token" + token);
        HttpSession session = request.getSession();
        session.setAttribute("token",token);                    //保存令牌，将令牌传递到jsp
        RequestDispatcher view = request.getRequestDispatcher("/JSP/sessionToken.jsp");
        view.forward(request,response);
    }
}
