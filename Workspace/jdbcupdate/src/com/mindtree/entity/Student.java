package com.mindtree.entity;

public class Student {
  private String student_no;
  private String surname;
  public String getStudent_no() {
	return student_no;
}
public void setStudent_no(String student_no) {
	this.student_no = student_no;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public String getForename() {
	return forename;
}
public void setForename(String forename) {
	this.forename = forename;
}
public Student(String student_no, String surname, String forename) {
	super();
	this.student_no = student_no;
	this.surname = surname;
	this.forename = forename;
}
private String forename;
public Student(String student_no, String surname) {
	super();
	this.student_no = student_no;
	this.surname = surname;
}
public Student() {
	// TODO Auto-generated constructor stub
}
  
}
