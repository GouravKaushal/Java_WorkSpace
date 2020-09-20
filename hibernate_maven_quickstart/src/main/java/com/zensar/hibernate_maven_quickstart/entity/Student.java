package com.zensar.hibernate_maven_quickstart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
//<class name="" table="">
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	
	@Column(name="name")
	private String studentName;
	
	@Column(name="age")
	private int studentAge ;
	
	
	public Student() {
		super();
	}
	
	public Student(String studentName, int studentAge) {
		super();
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public Student(int studentId, String studentName, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
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
		return "Student [StudentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}
}
