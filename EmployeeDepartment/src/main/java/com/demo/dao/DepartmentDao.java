package com.demo.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.demo.util.HibernateUtil;
import com.demo.beans.*;

public class DepartmentDao {

    public int addDepartment(Department dept) {
        Transaction tx = null;
        int id = 0;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            id = (int) session.save(dept);
            tx.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return id;
    }
}
