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

@WebServlet("/allbooks")
public class AllBooksServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("jsps/AllBooks.jsp");
        Connection connection = new Connection();

        List<Book> books = connection.getFromDataBase("from Book");

        req.setAttribute("books", books);

        dispatcher.forward(req, resp);
    }
}
