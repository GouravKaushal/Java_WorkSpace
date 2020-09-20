package com.zensar.product_management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	
	@Column(name = "name")
	private String productName;
	
	@Column(name = "cost")
	private int productCost;
	
	public Product(String productName, int productCost) {
		super();
		this.productName = productName;
		this.productCost = productCost;
	}

	@Override
	public String toString() {
		return "Product Details :- ID : " + productId + "Name : " + productName + " Cost : " + productCost;
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
