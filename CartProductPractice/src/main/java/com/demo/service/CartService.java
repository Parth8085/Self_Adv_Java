package com.demo.service;

import com.demo.beans.Cart;

public interface CartService {

	boolean createCart(String name);
	boolean addProductToCart(int cartId, int pid);
	Cart getCart(int id);

}
