package com.arr.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import com.arr.entity.Student;
import com.arr.service.CompareById;
import com.arr.service.CompareByname;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Student> arr= new ArrayList<Student>();
     Scanner sc= new Scanner(System.in);
     System.out.println("enter the size of the array");
     int n=sc.nextInt();
     for(int i=0;i<n;i++) {
    	 Student s=new Student();
    	 System.out.println("enter id");
    	 s.setId(sc.nextInt());
    	 System.out.println("enter name");
    	 s.setName(sc.next());
    	 arr.add(s);
     }
     System.out.println("Before sorting:");
//     for(Student st:arr) {
//    	 System.out.println(st.getId() + " " + st.getName());
//     }
     Iterator itr= arr.iterator();
     while(itr.hasNext()) {
    	 Student stud= (Student) itr.next();
    	 System.out.println(stud.getId() + " " + stud.getName());
     }
     System.out.println("after sorting by name:");
     Collections.sort(arr, new CompareByname());
     for(Student st:arr) {
    	 System.out.println(st.getId() + " " + st.getName());
     }
     System.out.println("after sorting by id:");
     Collections.sort(arr, new CompareById());
     for(Student st:arr) {
    	 System.out.println(st.getId() + " " + st.getName());
     }
	}

}
