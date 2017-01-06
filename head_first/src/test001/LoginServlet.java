package test001;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession s = request.getSession();    //获得一个会话
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		if("123".equals(password)){
			User user = new User();
			user.setUsername(userName);
			user.setPassword(password);
			s.setAttribute("user", user);
			RequestDispatcher view = request.getRequestDispatcher("/index.jsp"); //实例化一个请求分派器，将请求分派给JSP  				
			view.forward(request, response);  //向JSP发送请求和响应
		}else{
			RequestDispatcher view = request.getRequestDispatcher("/loginError.html"); //实例化一个请求分派器，将请求分派给JSP  				
			view.forward(request, response);  //向JSP发送请求和响应
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}
