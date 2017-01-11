package test001;

import DB.BookDb;
import dao.Book;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static DB.BookDb.*;

/**
 * Created by yanglc on 2017/1/11.
 */
@WebServlet(name = "CatServlet")
public class CartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        Book book = BookDb.getAll().get(id);
        System.out.println("bookId is:"+book.getId());
        HttpSession session = request.getSession();
        ArrayList<Book> list = (ArrayList<Book>) session.getAttribute("list");
        if(list == null){
            list = new ArrayList<Book>();
        }
        list.add(book);
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i).getId());
        }
        session.setAttribute("list",list);
        RequestDispatcher view = request.getRequestDispatcher("/JSP/cart.jsp");
        view.forward(request,response);
    }
}
