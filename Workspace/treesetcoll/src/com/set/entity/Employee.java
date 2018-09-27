package com.set.entity;

public class Employee implements Comparable<Employee> {
	private String name;
	private int mid;
	public Employee(String name, int mid, double salary) {
		super();
		this.name = name;
		this.mid = mid;
		this.salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	private double salary;
	
	/*public int compareTo(Employee e) {
		if(this.mid==e.getMid())
			return 0;
		else if(this.mid> e.getMid())
			return 1;
		else 
			return -1;
	} */
	 public int compareTo(Employee e) {
		 return this.name.compareToIgnoreCase(e.getName());
	 }
	
	}



