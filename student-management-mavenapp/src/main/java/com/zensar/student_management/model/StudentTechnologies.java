package com.zensar.student_management.model;

public class StudentTechnologies {

	private int id;
	private String technologies;
	private int studentId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTechnologies() {
		return technologies;
	}
	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "StudentTechnologies [id=" + id + ", technologies=" + technologies + ", studentId=" + studentId + "]";
	}
	
}
