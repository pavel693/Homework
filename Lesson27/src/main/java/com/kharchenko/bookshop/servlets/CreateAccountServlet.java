package com.kharchenko.bookshop.servlets;

import com.kharchenko.bookshop.persistence.Connection;
import com.kharchenko.bookshop.persistence.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/accountcreation")
public class CreateAccountServlet extends HttpServlet {

    private Connection connection = new Connection();
    private String loginContains;
    private String emailContains;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("jsps/Account.jsp");
        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");
        int age = Integer.parseInt(req.getParameter("age"));
        String email = req.getParameter("email");
        String login = req.getParameter("login");
        String password1 = req.getParameter("password1");
        String password2 = req.getParameter("password2");

        if (containOfEmailOrLogin(email, login) || !password1.equals(password2)) {
            if (emailContains != null) {
                req.setAttribute("email", email);
            }
            if (loginContains != null) {
                req.setAttribute("login", login);
            }
            if (!password1.equals(password2)) {
                req.setAttribute("pass", "pass");
            }
        } else {
            User user = new User();
            user.setFname(fname);
            user.setLname(lname);
            user.setAge(age);
            user.setEmail(email);
            user.setLogin(login);
            user.setPass(password1);
            connection.insertIntoUser(user);
            req.setAttribute("user", fname);
        }
        dispatcher.forward(req, resp);
    }

    public boolean containOfEmailOrLogin(String email, String login) {
        String hqlQuery = "from User u where email='" + email + "' or login='" + login + "'";
        List<User> users = connection.getFromDataBase(hqlQuery);
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getEmail().equals(email)) {
                emailContains = email;
            }
            if (users.get(i).getLogin().equals(login)) {
                loginContains = login;
            }
        }
        return (users.size() != 0);
    }
}
