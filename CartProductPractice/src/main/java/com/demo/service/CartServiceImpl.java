package com.demo.service;

import com.demo.beans.Cart;
import com.demo.beans.Product;
import com.demo.dao.CartDao;
import com.demo.dao.CartDaoImpl;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class CartServiceImpl implements CartService {
	CartDao cdao= new CartDaoImpl();
	ProductDao pdao= new ProductDaoImpl();

	@Override
	public boolean createCart(String name) {
		return cdao.save(new Cart(name));
	}

	@Override
	public boolean addProductToCart(int cartId, int pid) {
		Cart c=cdao.findById(cartId);
		Product p=pdao.findById(pid);
		
		if(c==null||p==null)
		{
			System.out.println("Cart or product not found!");
			return false;
		}
		
		return cdao.addProductToCart(c,p);
	}

	@Override
	public Cart getCart(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
