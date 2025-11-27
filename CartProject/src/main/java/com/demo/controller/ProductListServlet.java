package com.demo.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.demo.service.ProductService;
import com.demo.beans.Product;
import com.demo.service.*;

/**
 * Servlet implementation class CarListServlet
 */
@WebServlet("/ProductListServlet")
public class ProductListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		ProductService service=new ProductServiceImpl();
		List<Product>list=service.getAllProducts();
		request.setAttribute("productList", list);
		RequestDispatcher rd=request.getRequestDispatcher("Product.jsp");
		rd.forward(request, response);
	}
       
    

}
