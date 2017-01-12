package test001;

import DB.BookDb;
import dao.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanglc on 2017/1/12.
 */
@WebServlet(name = "CartServlet02")
public class BuyBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        Book book = BookDb.getAll().get(id);  //得到用户想买的书
        HttpSession session = request.getSession();
        List<Book> list = (List) session.getAttribute("list");  //得到用户用于保存所有书的容器
        if(list==null){
            list = new ArrayList<Book>();
            session.setAttribute("list", list);
        }
        list.add(book);
        //response. encodeRedirectURL(java.lang.String url)用于对sendRedirect方法后的url地址进行重写 ，重写后url地址上会自动的加上sessionId信息，这样就可以在禁用cookie时传递session信息
        String url = response.encodeRedirectURL(request.getContextPath()+"/Servlet019");
        System.out.println(url);
        response.sendRedirect(url);
    }
}
