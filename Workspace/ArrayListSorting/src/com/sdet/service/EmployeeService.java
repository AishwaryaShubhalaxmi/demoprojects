package com.sdet.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import com.sdet.entity.Employee;


public class EmployeeService implements Comparator<Employee> {
	   public int compare(Employee e1, Employee e2) {
		   
		   Date d1=e1.getDoj();
		   Date d2=e2.getDoj();
		   if(d1.compareTo(d2)>0) {
			   return 1;
			   
		   }else if(d1.compareTo(d2)<0) {
			   return -1;
		   }else {
			   return 0;
		   }
	   }
public ArrayList<Employee> processEmployee(ArrayList<Employee> list){
	ArrayList<Employee> arr= new ArrayList<Employee>();
	EmployeeService obj= new EmployeeService();
	Collections.sort(arr,obj);
	arr.addAll(list);
    return arr;
	}

}
