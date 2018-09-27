package com.arr.service;

import java.util.Comparator;

import com.arr.entity.Student;

public class CompareByName implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		String name1= s1.getName();
		String name2=s2.getName();
		return name1.compareTo(name2);
	}

}
