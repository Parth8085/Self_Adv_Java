package com.demo.service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	ProductDao pdao= new ProductDaoImpl();

	@Override
	public boolean createProduct(String pname, double price) {
		
		return pdao.save(new Product(pname,price));
		
	}

}
