package com.demo.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.util.HibernateUtil;
import com.demo.beans.MyUser;

public class MyUserDaoImpl implements MyUserDao {

    @Override
    public void saveUser(MyUser user) {

        Transaction tr = null;
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            tr = session.beginTransaction();

            session.save(user);

            tr.commit();
            System.out.println("User saved successfully!");

        } catch (Exception e) {
            if (tr != null) tr.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public MyUser getUser(int id) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        MyUser user = session.get(MyUser.class, id);
        session.close();
        return user;
    }
}
