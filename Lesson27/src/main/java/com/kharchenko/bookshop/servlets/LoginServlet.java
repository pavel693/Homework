package com.kharchenko.bookshop.servlets;

import com.kharchenko.bookshop.persistence.Book;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("jsps/Login.jsp");

        String login = req.getParameter("login");

        Cookie cookie = new Cookie("login", login);
        cookie.setMaxAge(30 * 60);
        cookie.setPath("/context");
        resp.addCookie(cookie);

        List<Book> books = new ArrayList<>();

        HttpSession session = req.getSession(true);
        session.setMaxInactiveInterval(30 * 60);
        session.setAttribute(login, books);
        dispatcher.forward(req, resp);
    }
}
