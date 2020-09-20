package com.zensar.candpapp.model;

import java.math.BigDecimal;

public class Coupon {
	private int id;
	private String couponCode;
	private BigDecimal discount;
	private String expiryDate;

	
	public Coupon() {
		super();
	}

	public Coupon(int id,String couponCode, BigDecimal discount, String expiryDate) {
		super();
		this.id=id;
		this.couponCode = couponCode;
		this.discount = discount;
		this.expiryDate = expiryDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "ID : " + id +  "</br>  Coupon Code : " + couponCode + "</br>  Discount= : " + discount
				+ "</br>  Expiry Date : " + expiryDate ;
	}

}
