package com.kharchenko.bookshop.servlets;

import com.kharchenko.bookshop.persistence.Book;
import com.kharchenko.bookshop.persistence.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/bookpage")
public class BookServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("jsps/Book.jsp");
        Connection connection = new Connection();
        int id = Integer.parseInt(req.getParameter("id"));
        String hql = "from Book b where b.id=" + id;

        List<Book> books = connection.getFromDataBase(hql);
        Book book = books.get(0);
        req.setAttribute("book", book);

        dispatcher.forward(req, resp);
    }
}
