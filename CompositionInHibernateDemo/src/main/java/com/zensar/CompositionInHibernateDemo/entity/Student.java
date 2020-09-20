package com.zensar.CompositionInHibernateDemo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
	@Id
	private int studentRoll;
	
	private String studentName;
	
	private int studentMarks;

	private List<Laptop> laptop=new ArrayList<Laptop>();
	
	public Student() {
		super();
	}

	public Student(int studentRoll, String studentName, int studentMarks) {
		super();
		this.studentRoll = studentRoll;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}

	public int getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return "Student [studentRoll=" + studentRoll + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ "]";
	}
	
	
}
