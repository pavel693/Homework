package com.kharchenko.bookshop.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/logout")
public class LogOutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("jsps/Logout.jsp");

        Cookie[] cookies = req.getCookies();
        String login = cookies[0].getValue();

        Cookie cookie = new Cookie("login", login);
        cookie.setMaxAge(0);
        cookie.setPath("/context");
        resp.addCookie(cookie);

        HttpSession session = req.getSession(false);
        if (!session.isNew() && session != null) {
            session.invalidate();
        }
        dispatcher.forward(req, resp);
    }
}
