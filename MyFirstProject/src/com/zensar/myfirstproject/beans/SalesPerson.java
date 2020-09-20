package com.zensar.myfirstproject.beans;

public class SalesPerson extends WageEmployee {

	private int commission;

	public SalesPerson(int employeeId, String employeeName, int employeeSalary, int hours, int rate, int commition) {
		super(employeeId, employeeName, employeeSalary, hours, rate);
		this.commission = commition;
	}

	public double calculateSalary() {
		return super.calculateSalary() + commission;
	}

	public String toString() {
		return (super.toString() + "\nCommition : " + commission);
	}
}
 