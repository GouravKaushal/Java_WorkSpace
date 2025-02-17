package com.zensar.entity;

public class Product {

	private int productId;
	private String productName;
	private int productCost;

	public Product(String productName, int productCost) {
		super();
		this.productName = productName;
		this.productCost = productCost;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ "]";
	}

	public int getProductId() {
		return productId;
	}

	public Product() {
		super();
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductCost() {
		return productCost;
	}

	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	

}
