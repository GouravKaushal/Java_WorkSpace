package com.zensar.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class NextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		/*
		 * HttpSession session=request.getSession(); String user =(String)
		 * session.getAttribute("user");
		 */
	Cookie[] cookies=request.getCookies();
	for(int i=0;i<cookies.length;i++)
	{
		response.getWriter().print(cookies[i].getName());
	}
	}

	


}
