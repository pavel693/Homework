package com.kharchenko.servlets;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Servlets {

    private static final SessionFactory INSTANCE = new Configuration()
            .configure()
            .buildSessionFactory();

    public static SessionFactory getInstance() {
        return INSTANCE;
    }

    public List getFromDataBase(String queryHql) {

        Session session = getInstance().openSession();

        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery(queryHql);
        List list = query.getResultList();

        transaction.commit();
        session.close();
        return list;
    }
}
