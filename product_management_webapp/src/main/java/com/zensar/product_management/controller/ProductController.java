package com.zensar.product_management.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.product_management.model.Product;
import com.zensar.product_management.repository.ProductRepository;
import com.zensar.product_management.repositoryprovider.RepositoryProvider;

public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductRepository provider;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		provider=RepositoryProvider.getRepositoryProvider(request,response);
		String action=request.getParameter("action");
		if(action.equals("insert"))
			insert(request, response);
		else if(action.equals("displayAll"))
			displayAll(request, response);
		else if(action.equals("displayOne"))
			displayOne(request, response);
		else if(action.equals("delete"))
			deleteProduct(request, response);
		
			

	}

	public void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productName = request.getParameter("textProductName");
		String productCost = request.getParameter("textProductCost");
		Product product = new Product();
		product.setProductCost(Integer.parseInt(productCost));
		product.setProductName(productName);
		//int productId=productDao.insert(product);
		int productId=provider.insertProduct(product);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("insert-success.jsp");
		request.setAttribute("productId", productId);
		dispatcher.forward(request, response);
	}
	
	public void displayAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("display-all.jsp");
	}
	public void displayOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productId=request.getParameter("productId");
	//	String productDetails=productDao.displayOneProduct(Integer.parseInt(productId));
		String productDetails=provider.displayOneProduct(Integer.parseInt(productId));
		RequestDispatcher dispatcher = request.getRequestDispatcher("displayOneResult.jsp");
		//request.setAttribute("productDetails", productDetails);
		dispatcher.forward(request, response);
	}
	public void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productId=request.getParameter("productId");
		//String deletedProduct = productDao.deleteProduct(Integer.parseInt(productId));
		String deletedProduct=provider.deleteProduct(Integer.parseInt(productId));
		RequestDispatcher dispatcher = request.getRequestDispatcher("deleteProductResult.jsp");
	//	request.setAttribute("productDetails", deletedProduct);
		dispatcher.forward(request, response);
		
		
	}
	
}
