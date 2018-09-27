package com.mindtree.entity1;
import java.util.*;
 public class Student {
  private String name;
  private int rollNo;
  private Double marks;
  private Date doj;
  
  public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public Double getMarks() {
	return marks;
}

public void setMarks(Double marks) {
	this.marks = marks;
}
public void setDate(Date doj) {
	this.doj=doj;
}
public Date getDate() {
	return doj;
}

public Student(String name, int rollNo, Double marks, Date doj) {
	super();
	this.name = name;
	this.rollNo = rollNo;
	this.marks = marks;
	this.doj=doj;
}
  
  
}


