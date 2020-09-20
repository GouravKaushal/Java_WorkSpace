package com.zensar.repository.impl;

import com.zensar.entity.Product;
import com.zensar.repository.ProductRepository;

public class ProductRepositoryImpl implements ProductRepository {

	Product[] products = new Product[20];
	private static int INDEX = 0, productId = 100;

	public int insertProduct(Product product) {
		products[INDEX++] = product;
		product.setProductId(productId++);
		return product.getProductId();
	}

	@Override
	public Product[] getAllProducts() {
		return products;
	}

	@Override
	public Product getProduct(int productId) {
		for(Product product:products)
		{
			if(product.getProductId()==productId)
			{
				return product;
			}
		}
		return null;
	}

	@Override
	public Product[] deleteProduct(int productId) {
		
		for(int i=0;i<products.length;i++)
		{
			if(products[i].getProductId()==productId)
			{
				products[i]=null;
				return products;
			}
		}
		return products;
	}


	
}
