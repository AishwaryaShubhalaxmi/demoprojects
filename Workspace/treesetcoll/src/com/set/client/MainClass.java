package com.set.client;

import java.util.Scanner;
import java.util.Set;
//import java.util.TreeSet;
import java.util.TreeSet;

import com.set.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size:");
    int n=sc.nextInt();
    Set<Employee> tr= new TreeSet<Employee>();
    for(int i=0;i<n;i++) {
    	Employee emp= new Employee();
    	System.out.println("enter name");
    	emp.setName(sc.next());
    	System.out.println("enter mid");
    	emp.setMid(sc.nextInt());
    	System.out.println("enter salary");
    	emp.setSalary(sc.nextDouble());
        tr.add(emp);
    }
    for(Employee e:tr) {
    	System.out.println(e.getName() + " " + e.getMid() + " " + e.getSalary());
    }
	}
     
}

