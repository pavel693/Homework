package com.kharchenko.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/students")
public class ServletsStudents extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Servlets servlets = new Servlets();
        String query = "from Student";
        List<Student> studentList = servlets.getFromDataBase(query);
        for (Student student : studentList) {
            out.println(student.toString());
        }
    }
}
