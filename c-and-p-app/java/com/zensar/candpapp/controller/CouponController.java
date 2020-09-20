package com.zensar.candpapp.controller;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.candpapp.dao.CouponDao;
import com.zensar.candpapp.model.Coupon;

@WebServlet("/coupons")
public class CouponController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CouponDao couponDao = new CouponDao();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		if (action.equals("create")) {
			createCoupon(request, response);
		} else if (action.equals("find")) {
			findCoupon(request, response);
		}

	}

	public void createCoupon(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String code = request.getParameter("code");
		String discount = request.getParameter("discount");
		String expiryDate = request.getParameter("expiryDate");

		Coupon coupon = new Coupon();
		coupon.setCouponCode(code);
		coupon.setDiscount(new BigDecimal(discount));
		coupon.setExpiryDate(expiryDate);

		couponDao.save(coupon);

		response.sendRedirect("success.html");

	}

	public void findCoupon(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String couponCode = request.getParameter("couponCode");
		Coupon coupon=couponDao.findByCode(couponCode);
		RequestDispatcher dispatcher=request.getRequestDispatcher("showCoupon.jsp");
		request.setAttribute("coupon", coupon);
		dispatcher.forward(request, response);
		
	}

}
