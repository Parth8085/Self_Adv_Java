package com.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Product;
import com.demo.util.HibernateUtil;

public class ProductDaoImpl implements ProductDao {
	static SessionFactory sf;
	static
	{
		sf=HibernateUtil.getMySessionFactory();
	}

	@Override
	public boolean save(Product p) {
		Session session =sf.openSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(p);
		tr.commit();
		session.close();
		return true;
	}

	@Override
	public Product findById(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

}
