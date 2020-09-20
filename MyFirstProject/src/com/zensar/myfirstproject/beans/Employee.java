package com.zensar.myfirstproject.beans;

public class Employee implements Comparable {
	private int employeeId;
	private String employeeName;
	private int employeeSalary;
	// private MyDate birthDate;
	// private MyAddress address;

	public Employee() {

	}

	/*
	 * public Employee(int employeeId, String employeeName, int employeeSalary,
	 * MyDate birthDate) { super(); this.employeeId = employeeId; this.employeeName
	 * = employeeName; this.employeeSalary = employeeSalary; this.birthDate =
	 * birthDate; }
	 */

	public Employee(int employeeId, String employeeName, int employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public double calculateSalary() {
		return 0;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String toString() {
		return ("\nEmployee ID : " + employeeId + "\nEmployee Name :" + employeeName
		+"\nEmployee Salary "+employeeSalary
				// "\nEmployee Birth Date :"
		);
	}

	public void display() {
		System.out.println("Employee vala");
	}
	/*
	 * public void getEmployeeDetails() { System.out.println("Employee ID :" +
	 * employeeId); System.out.println("Employee Name :" + employeeName);
	 * System.out.println("Employee Salary :" + employeeSalary);
	 * System.out.println("Employee Birth Date :" + birthDate); }
	 */

	/*
	 * public boolean equals(Object obj) { Employee emp = (Employee) obj; if
	 * (emp.getEmployeeId() == this.getEmployeeId() && emp.getEmployeeName() ==
	 * this.getEmployeeName() && emp.getEmployeeSalary() ==
	 * this.getEmployeeSalary()) { return true; } return false; }
	 */

	@Override
	public int compareTo(Object o) {

		Employee e1 = (Employee) o;
		if (this.getEmployeeId() > e1.getEmployeeId())
			return 1;
				//any +ve value
		if (this.getEmployeeId() < e1.getEmployeeId())
			return -1;
		//any -ve value
		if (this.getEmployeeId() == e1.getEmployeeId())
			return 0;

		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + employeeSalary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (employeeSalary != other.employeeSalary)
			return false;
		return true;
	}

}
