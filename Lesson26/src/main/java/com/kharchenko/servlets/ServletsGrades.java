package com.kharchenko.servlets;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;


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

    public List<Grade> getSubjects() {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from Grade");
        List<Grade> grades = query.getResultList();

        transaction.commit();
        session.close();
        return grades;
    }
}
