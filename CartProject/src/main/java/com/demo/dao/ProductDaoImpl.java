package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao {

	@Override
	public List<Product> getAllProducts() {
		List<Product>list = new ArrayList<>();
		Connection conn=DBConnection.getConnection();
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("Select * from cars");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Product p=new Product();
				p.setProductId(rs.getInt("productId"));
				p.setName(rs.getString("name"));
				p.setPrice(rs.getDouble("price"));
				p.setQty(rs.getInt("qty"));
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		


		return null;
	}

}
