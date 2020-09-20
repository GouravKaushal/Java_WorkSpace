package com.zensar.myfirstproject.beans;

public class MyAddress {
	private int houseNo;
	private String streetName;
	private String areaName;
	public MyAddress(int houseNo, String streetName, String areaName) {
		super();
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.areaName = areaName;
	}
	
	public String toString() {
		return ("House No. : "+houseNo+"\nStreet Name : "+streetName+"\nArea Name : "+streetName);
				
	}
 
}
