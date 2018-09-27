package com.student.service;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.student.entity.Student;

public class ServiceImpl {
	
	Scanner sc= new Scanner(System.in);
	public void storeInList() {
		ArrayList<Student> arr= new ArrayList<Student>();
		for(int i=0;i<5;i++) {
			Student st= new Student();
			System.out.println("enter id");
			int id= sc.nextInt();
			st.setId(id);
			System.out.println("enter name");
			String name= sc.next();
			st.setName(name);
			System.out.println("enter marks");
			float marks=sc.nextFloat();
			st.setMarks(marks);
			arr.add(st);
			}
		for(Student s:arr) {
			System.out.print(s.getName() + " " + s.getName() + " "+ s.getMarks());
		}
		
	}
		
		public void storeToSet(ArrayList<Student> arr) {
			Set<Student> set= new TreeSet<Student>(arr);
			for(Student s:set) {
				System.out.println(s.getName() + s.getName() + s.getMarks());
			}
			
		}
	}


