package com.zensar.service.impl;

import com.zensar.entity.Product;
import com.zensar.repository.impl.ProductRepositoryImpl;
import com.zensar.service.ProductService;

public class ProductServiceImpl implements ProductService {



	ProductRepositoryImpl productRepositoryImpl=new ProductRepositoryImpl();

	public int acceptProduct(String productName,int productCost)
	{	
		return productRepositoryImpl.insertProduct(new Product(productName,productCost));
	}

	@Override
	public Product[] getAllProducts() {
	
		return productRepositoryImpl.getAllProducts();
	}

	@Override
	public Product getProduct(int productId) {
	
		return productRepositoryImpl.getProduct(productId);
	}

	@Override
	public Product[] deleteProduct(int productId) {
		
		return productRepositoryImpl.deleteProduct(productId);
	}
}
