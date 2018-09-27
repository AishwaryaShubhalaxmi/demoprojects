package com.mindtree.entity1;
import java.text.SimpleDateFormat;
import java.util.*;

import com.mindtree.util.DateComparator;
import com.mindtree.util.MarksComparator;
import com.mindtree.util.NameComparator;
public class Solution {

	public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub
		String d="30/06/2018";
		  Date date=new SimpleDateFormat("dd/MM/yyyy").parse(d); 
		  String d1="25/06/2018";
		  Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(d1);
		  String d2="28/06/2018";
		  Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(d2);
		  String d3="21/06/2018";
		  Date date3=new SimpleDateFormat("dd/MM/yyyy").parse(d3);
		
		  
		Student s1= new Student("Tia",20, 25.00,date);    //Creating objects
		Student s2= new Student("Smita",21, 24.00,date1);
		Student s3= new Student("Rashmita",22, 28.00,date2);
		Student s4= new Student("Ankita",23, 22.00,date3);
		
		ArrayList<Student> arr= new ArrayList<Student>();  //creating arrayList
		
		arr.add(s1);  //Adding objects to arrayList
		arr.add(s2);
		arr.add(s3);
		arr.add(s4);
		
		System.out.println("Before Sorting:");
		for(Student s: arr) {
			System.out.println(s.getName() + " " + s.getRollNo() + " " + s.getMarks() + " " + s.getDate());
		}
        
		System.out.println("Sorting by name");
		Collections.sort(arr, new NameComparator());
		for(Student s: arr) {
			System.out.println(s.getName() + " " + s.getRollNo() + " " + s.getMarks()+ " " + s.getDate());
		}
		
		System.out.println("Sorting by marks:");
		Collections.sort(arr, new MarksComparator());
		for(Student s: arr) {
			System.out.println(s.getName() + " " + s.getRollNo() + " " + s.getMarks() + " " + s.getDate());
		}
		 System.out.println("Sorting by date");
		 Collections.sort(arr, new DateComparator());
			for(Student s: arr) {
				System.out.println(s.getName() + " " + s.getRollNo() + " " + s.getMarks() + " " + s.getDate());
			}
	}

}
