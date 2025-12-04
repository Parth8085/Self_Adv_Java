package com.demo.test;

import com.demo.service.CartServiceImpl;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;
import com.demo.service.CartService;

public class MyTest {
	public static void main(String [] args)
	{
		CartService cservice=new CartServiceImpl();
		ProductService pservice = new ProductServiceImpl();
		cservice.createCart("MyCart");          // cartId = 1
		cservice.createCart("NainuCart");       // cartId = 2
		cservice.createCart("SeemaCart");      // cartId = 3
		System.out.println("3 Carts added into the database ");
		
		
		pservice.createProduct("Laptop", 50000);
		pservice.createProduct("Mouse", 700.70);
		pservice.createProduct("MotherBoard", 7500.00);
		System.out.println("Products Successfully Created");
		
		//1st Cart
		cservice.addProductToCart(1, 1);
		cservice.addProductToCart(1, 2);
		cservice.addProductToCart(1, 3);
		System.out.println("This is Parth's Cart");
		
		//2nd cart
		cservice.addProductToCart(2, 1);
		System.out.println("This is Nainu's Cart");
		
		//3rd Cart
		cservice.addProductToCart(3, 3);
		cservice.addProductToCart(3, 2);
		System.out.println("This is Seema,s Cart");
		
	}
	


}
