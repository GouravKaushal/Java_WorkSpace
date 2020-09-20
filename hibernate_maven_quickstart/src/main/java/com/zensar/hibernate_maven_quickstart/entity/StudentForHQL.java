package com.zensar.hibernate_maven_quickstart.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentForHQL {

	@Id
	private int studentId;

	private String studentName;

	private int studentAge;
	
	
	

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "StudentForHQL [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ "]";
	}
	
	
	
}
