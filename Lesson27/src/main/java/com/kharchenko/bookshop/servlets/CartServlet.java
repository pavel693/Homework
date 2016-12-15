package com.kharchenko.bookshop.servlets;

import com.kharchenko.bookshop.persistence.Book;
import com.kharchenko.bookshop.persistence.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("jsps/Cart.jsp");
        if (req.getCookies() == null) {
            resp.sendRedirect("/context/login.html");
        } else {
            Cookie[] cookies = req.getCookies();
            String login = cookies[0].getValue();

            Connection connection = new Connection();
            int id = Integer.parseInt(req.getParameter("id"));
            String hql = "from Book b where b.id=" + id;

            List<Book> books = connection.getFromDataBase(hql);
            Book book = books.get(0);

            HttpSession session = req.getSession();
            List<Book> sessionBooks = (List<Book>) session.getAttribute(login);
            sessionBooks.add(book);
            session.setAttribute(login, sessionBooks);

            req.setAttribute("books", sessionBooks);
            dispatcher.forward(req, resp);
        }
    }
}
