package com.demo.dao;

import java.util.List;

import com.demo.beans.Cart;
import com.demo.beans.Product;

public interface CartDao {

	boolean save(Cart c);
	Cart findById(int cartId);
	List<Cart> findAll();
	boolean addProductToCart(Cart c, Product p);

}
