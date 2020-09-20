package com.zensar.service;

import com.zensar.entity.Product;

public interface ProductService {

	public int acceptProduct(String productName, int productCost);
	public Product[] getAllProducts();
	public Product getProduct(int productId);
	public Product[] deleteProduct(int productId);
	
}
