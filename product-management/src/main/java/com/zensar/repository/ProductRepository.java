package com.zensar.repository;

import com.zensar.entity.Product;

public interface ProductRepository {

	public int insertProduct(Product product);
	public Product[] getAllProducts();
	public Product getProduct(int productId);
	public Product[] deleteProduct(int productId);
}
