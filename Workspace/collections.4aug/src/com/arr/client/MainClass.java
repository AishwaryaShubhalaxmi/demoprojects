package com.arr.client;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.arr.entity.Student;
import com.arr.service.CompareByDoj;
import com.arr.service.CompareByName;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      ArrayList<Student> arr= new ArrayList<Student>();
      for(int i=0;i<2;i++) {
    	  Student s= new Student();
    	  System.out.println("Enter name");
    	  s.setName(sc.next());
    	  System.out.println("Enter id");
    	  s.setId(sc.nextInt());
    	  System.out.println("Enter marks");
    	  s.setMarks(sc.nextDouble());
    	  System.out.println("Enter date");
    	  String str= sc.next();
    	  try {
			Date doj=new SimpleDateFormat("dd/MM/yyyy").parse(str);
			s.setDate(doj);
		      } catch (ParseException e) {
	            System.out.println(e.getMessage());
		      }
    	  arr.add(s); 
      }
       System.out.println("Before Sorting:");
    	for(Student s1:arr) {
    		System.out.println(s1.getName() + " " + s1.getId() + " " + s1.getMarks() + " " + s1.getDate());
    	}
    	
    	System.out.println("After sorting by name:");
    	Collections.sort(arr, new CompareByName());
    	for(Student student: arr) {
    		System.out.println(student.getName() + " " + student.getId() + " " + student.getMarks() + " "+ student.getDate() );
    	}
    	System.out.println("After sorting by doj:");
    	Collections.sort(arr, new CompareByDoj());
    	for(Student student: arr) {
    		System.out.println(student.getName() + " " + student.getId() + " " + student.getMarks() + " "+ student.getDate() );
    	}
    	
      }
	
     
	}


