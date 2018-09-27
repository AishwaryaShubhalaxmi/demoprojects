package com.fileHandling.entity;

import java.util.Date;

public class User {
  private String mid;
  private String name;
  private Date doj;
  private String role;
public User(String mid, String name, Date doj, String role) {
	super();
	this.mid = mid;
	this.name = name;
	this.doj = doj;
	this.role = role;
}
public User() {
	// TODO Auto-generated constructor stub
}
public String getMid() {
	return mid;
}
public void setMid(String mid) {
	this.mid = mid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getDoj() {
	return doj;
}
public void setDoj(Date doj) {
	this.doj = doj;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
  
}
