package com.kharchenko.servlets;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class MainHibernate {

    public static void main(String[] args) {
        MainHibernate mainHibernate = new MainHibernate();
        List<Student> studentList = mainHibernate.getStudents();
        System.out.println(studentList.toString());
        for (Student student : studentList) {
            System.out.println(student.getFname() + " " + student.getLname() + " " + student.getAge());
        }
    }


    public static void addStudent() {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Student student = new Student();
        student.setFname("Jackie");
        student.setLname("Chan");
        student.setAge(50);

        session.save(student);

        transaction.commit();
        session.close();
    }

    public List<Student> getStudents() {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from Student");
        List<Student> students = query.getResultList();

        transaction.commit();
        session.close();
        return students;
    }
}
