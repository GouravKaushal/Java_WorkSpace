package com.zensar.student_management.model;

public class StudentHobbies {
	private int id;
	private String hobby;
	private int studentId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "StudentHobbies [id=" + id + ", hobby=" + hobby + ", studentId=" + studentId + "]";
	}
	
	
	
}
