package com.mindtree.util;

import com.mindtree.entity1.Student;
import java.util.*;
public class MarksComparator implements Comparator {
	 public int compare(Object o1,Object o2){  
		 Student s1=(Student)o1;  
		 Student s2=(Student)o2;  
		   
		 return s1.getMarks().compareTo(s2.getMarks());  
		 }   
}
