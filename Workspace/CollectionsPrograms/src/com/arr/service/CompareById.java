package com.arr.service;

import java.util.Comparator;

import com.arr.entity.Student;

public class CompareById implements Comparator<Student>{
	 public int compare(Student s1, Student s2) {
		 int id1=s1.getId();
		 int id2=s2.getId();
		 if(id1==id2) 
			 return -1;
		 else return 0;
		 
	 }

}
