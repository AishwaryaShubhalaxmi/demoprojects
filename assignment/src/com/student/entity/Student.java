package com.student.entity;

public class Student {
 private int id;
 public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getMarks() {
	return marks;
}
public void setMarks(float marks) {
	this.marks = marks;
}
private String name;
 public Student(int id, String name, float marks) {
	super();
	this.id = id;
	this.name = name;
	this.marks = marks;
}
public Student() {
	// TODO Auto-generated constructor stub
}
private float marks;
 
 
}
