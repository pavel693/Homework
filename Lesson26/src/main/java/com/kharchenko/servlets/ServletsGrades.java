package com.kharchenko.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/grades")
public class ServletsGrades extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        JdbcConnection jdbcConnection = new JdbcConnection();
        try {
            out.println(jdbcConnection.getStatistic(jdbcConnection.jdbcConnection()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
