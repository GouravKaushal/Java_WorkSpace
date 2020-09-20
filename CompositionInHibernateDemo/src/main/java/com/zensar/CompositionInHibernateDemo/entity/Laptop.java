package com.zensar.CompositionInHibernateDemo.entity;

public class Laptop {

	private int laptopId;
	
	private String laptopName;
	
	

	public Laptop() {
		super();
	}

	public Laptop(int laptopId, String laptopName) {
		super();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + "]";
	}
	
	
}
