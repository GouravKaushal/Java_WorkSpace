package com.zensar.product_management.repositoryprovider;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.product_management.repository.ProductRepository;

public class RepositoryProvider {

	public static ProductRepository getRepositoryProvider(HttpServletRequest request, HttpServletResponse response) {
		ServletContext context;
		ProductRepository productRepository=null;;
	
		context=request.getServletContext();
		String providerName=context.getInitParameter("repositoryprovider");
		System.out.println("repositoryprovider : "+providerName);
	
		try {
			productRepository = (ProductRepository) Class.forName(providerName).newInstance();

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return productRepository;

	}
}
