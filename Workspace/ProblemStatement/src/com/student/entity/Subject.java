package com.student.entity;

public class Subject {
 private String sub_name;
 private int marks;
 private int sub_id;
 private int s_id;
public String getSub_name() {
	return sub_name;
}
public void setSub_name(String sub_name) {
	this.sub_name = sub_name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public int getSub_id() {
	return sub_id;
}
public void setSub_id(int sub_id) {
	this.sub_id = sub_id;
}
public int getS_id() {
	return s_id;
}
public void setS_id(int s_id) {
	this.s_id = s_id;
}
public Subject(String sub_name2, int sub_id2, int marks2) {
	// TODO Auto-generated constructor stub
	this.sub_name = sub_name2;
	this.marks = marks2;
	this.sub_id = sub_id2;
}
 
public Subject(String sub_name, int marks, int sub_id, int s_id) {
	this.sub_name = sub_name;
	this.marks = marks;
	this.sub_id = sub_id;
	this.s_id = s_id;
}
public Subject() {
	// TODO Auto-generated constructor stub
}

 
}
