package com.demo.service;
import java.util.List;
import com.demo.dao.*;

import com.demo.beans.*;

public class ProductServiceImpl implements ProductService {
	ProductDao dao=new ProductDaoImpl();
	

	@Override
	public List<Product> getAllProducts() {
		
		return dao.getAllProducts();
	}

}
