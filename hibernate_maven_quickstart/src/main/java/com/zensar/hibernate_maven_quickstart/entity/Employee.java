package com.zensar.hibernate_maven_quickstart.entity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


//@Inheritance(strategy = InheritanceType.JOINED)*/
/*
 * @DiscriminatorColumn(name = "type",discriminatorType =
 * DiscriminatorType.STRING)
 * 
 * @DiscriminatorValue(value = "emp")
 */

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Employee {
	@Id
	private int employeeId;
	@Column(name="name")
	private String employeeName;
	@Column(name = "salary")
	private int employeeSalary;
	/*
	 * @OneToMany private List<Address> address;
	 */

	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, int employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
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
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	

	/*
	 * public Address getAddress() { return address; }
	 * 
	 * public void setAddress(Address address) { this.address = address; }
	 */
	/*
	 * public List<Address> getAddress() { return address; }
	 * 
	 * public void setAddress(List<Address> address) { this.address = address; }
	 */
	public int calculateSalary()
	{
		return getEmployeeSalary();
	}
	@Override
	public String toString() {
		return "\nEmployee Details Employee Id : " + employeeId + ", Employee Name : " + employeeName + ", Employee Salary : "
				+ employeeSalary ;
	}
	
	
	
}
