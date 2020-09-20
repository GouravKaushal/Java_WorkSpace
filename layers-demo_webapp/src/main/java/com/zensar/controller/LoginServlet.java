package com.zensar.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.service.LoginService;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String user = request.getParameter("textUser");
	String password = request.getParameter("textPassword");
	
	LoginService loginService=new LoginService();
	boolean result = loginService.isValiduser(user, password);
	RequestDispatcher dispatcher=null;
	if(result){
		dispatcher=request.getRequestDispatcher("afterlogin.jsp");
		dispatcher.forward(request, response);
	}else {
		dispatcher=request.getRequestDispatcher("login.html");
		dispatcher.forward(request, response);
	}
	
	}

}
