package com.zensar.myfirstproject.beans;

import java.io.Serializable;

public class WageEmployee extends Employee  {

	private int hours;
	private int rate;

	public WageEmployee(int employeeId, String employeeName, int employeeSalary, int hours, int rate) {
		/*
		 * setEmployeeId(employeeId); setEmployeeName(employeeName);
		 * setEmployeeSalary(employeeSalary);
		 */
		super(employeeId, employeeName, employeeSalary);
		this.hours = hours;
		this.rate = rate;
	}

	public double calculateSalary() {
		return hours * rate;
	}

	public String toString() {
		return (super.toString() + "\nHours : " + hours + "\nRate : " + rate);
	}
	/*
	 * public void display() { System.out.println("WageEmployee vala"); }
	 */

}
