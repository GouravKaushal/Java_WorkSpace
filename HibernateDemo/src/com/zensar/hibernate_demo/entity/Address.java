package com.zensar.hibernate_demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	private String city;
	private String state;
	@Id
	private int pincode;
	
	@ManyToOne
	@JoinColumn(name = "employeeId")
	private Employee employee;
	
	public Address() {
		super();
	}
	public Address(String city, String state, int pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}

}
