package com.sdet.entity;

import java.util.Date;

public class Employee {
  private int id;

private String name;
  @Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((doj == null) ? 0 : doj.hashCode());
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (doj == null) {
		if (other.doj != null)
			return false;
	} else if (!doj.equals(other.doj))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
private Date doj;
public Employee(int id, String name, Date doj) {
	super();
	this.id = id;
	this.name = name;
	this.doj = doj;
}
public Employee() {
	// TODO Auto-generated constructor stub
}

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
public Date getDoj() {
	return doj;
}
public void setDoj(Date doj) {
	this.doj = doj;
}
}
