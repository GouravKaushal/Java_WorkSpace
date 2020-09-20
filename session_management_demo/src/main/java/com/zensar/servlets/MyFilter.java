package com.zensar.servlets;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class MyFilter implements Filter {

 
	public void destroy() {

	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("Before Servlet calling");
		chain.doFilter(request, response);
		System.out.println("After Servlet calling");
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
