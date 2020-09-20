package com.zensar.hibernate_demo.entity;

//@Entity
/* @DiscriminatorValue(value = "wemp") */
public class WageEmployee extends Employee{

	private int hours;
	
	private int rate;

	public WageEmployee() {
		super();
	}

	public WageEmployee( int employeeId, String employeeName, int employeeSalary,int hours,int rate) {
		super(employeeId, employeeName, employeeSalary);
		this.hours=hours;
		this.rate=rate;
	}
	
	
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public int calculateSalary() 
	{
		return super.calculateSalary()+rate*hours;
	}

	@Override
	public String toString() {
		return super.toString()+"WageEmployee [hours=" + hours + ", rate=" + rate + "]";
	}
	
	
}
