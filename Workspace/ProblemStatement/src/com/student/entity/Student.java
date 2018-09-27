package com.student.entity;

 public class Student {
   private String st_name;
   private int st_id;
 public Student(String st_name, int st_id) {
	super();
	this.st_name = st_name;
	this.st_id = st_id;
}
public Student() {
	// TODO Auto-generated constructor stub
}
public String getSt_name() {
	return st_name;
}
public void setSt_name(String st_name) {
	this.st_name = st_name;
}
public int getSt_id() {
	return st_id;
}
public void setSt_id(int st_id) {
	this.st_id = st_id;
}

   
   
}
