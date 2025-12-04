package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Cart;
import com.demo.beans.Product;
import com.demo.util.HibernateUtil;

public class CartDaoImpl implements CartDao {
	static SessionFactory sf;
	static {
		sf=HibernateUtil.getMySessionFactory();
	}

	@Override
	public boolean save(Cart c) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(c);
		tr.commit();
		session.close();
		
		return true;
	}

	@Override
	public Cart findById(int cartId) {
		Session session =sf.openSession();
		Cart c=session.get(Cart.class, cartId);
		session.close();
		return null;
	}

	@Override
	public List<Cart> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addProductToCart(Cart c, Product p) {
		Session session=sf.openSession();
		Transaction tr= session.beginTransaction();
		c.getpset().add(p);
		p.getcset().add(c);
		session.update(c);
		tr.commit();
		session.close();
		System.out.println("Product added successfully");
		
		return true;
	}

}
