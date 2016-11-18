package com.kharchenko.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/subjects")
public class ServletSubjects extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Servlets servlets = new Servlets();
        String query = "from Subject";
        List<Subject> subjects = servlets.getFromDataBase(query);
        for (Subject subject : subjects) {
            out.println(subject.toString());
        }
    }
}
