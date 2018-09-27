package com.mindtree.util;

import java.util.Comparator;

import com.mindtree.entity1.Student;

public class DateComparator implements Comparator {
	 public int compare(Object o1,Object o2){  
		 Student s1=(Student)o1;  
		 Student s2=(Student)o2;  
		   
		 return s1.getDate().compareTo(s2.getDate());  
		 }   
}
