package com.zensar.candpapp.controller;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.candpapp.dao.CouponDao;
import com.zensar.candpapp.dao.ProductDao;
import com.zensar.candpapp.model.Coupon;
import com.zensar.candpapp.model.Product;


@WebServlet("/products")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       CouponDao couponDao=new CouponDao();
       ProductDao productDao=new ProductDao();
  
   


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("productName");
		String discription = request.getParameter("discription");
		String price = request.getParameter("price");
		String code = request.getParameter("code");
		
		Coupon coupon=couponDao.findByCode(code);
		Product product=new Product();
		product.setName(name);
		product.setDescription(discription);
		product.setPrice(new BigDecimal(price).subtract(coupon.getDiscount()));
		
		productDao.save(product);
		
		response.sendRedirect("productCreated.jsp");
	}

}
