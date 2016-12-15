package com.kharchenko.bookshop.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Connection {

    private static volatile SessionFactory instance;

    public static SessionFactory getInstance() {
        SessionFactory localInstance = instance;
        if (localInstance == null) {
            synchronized (com.kharchenko.bookshop.persistence.Connection.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Configuration()
                            .configure()
                            .buildSessionFactory();
                }
            }
        }
        return localInstance;
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

    public void insertIntoUser(User user) {
        Session session = getInstance().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }
}
