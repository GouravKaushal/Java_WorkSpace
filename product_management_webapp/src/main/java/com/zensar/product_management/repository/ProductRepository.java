package com.zensar.product_management.repository;

import com.zensar.product_management.model.Product;

public interface ProductRepository {

	public int insertProduct(Product product);
	public void displayAllProduct();
	public String displayOneProduct(int productId);
	public String deleteProduct(int productId);
}
