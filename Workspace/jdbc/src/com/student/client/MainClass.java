package com.student.client;

import java.util.ArrayList;
import java.util.Scanner;

import com.student.entity.Student;
import com.student.service.ServiceImpl;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      System.out.println("enter your choice:");
      System.out.println("1.insert 2.update ");
      int choice=sc.nextInt();
      switch(choice) {
      case 1:
       ServiceImpl serv=new ServiceImpl();
       System.out.println("Enter student id");
       int student_id=sc.nextInt();  
       System.out.println("Enter student name");
       String name=sc.next();
       System.out.println("Enter student stream");
       String stream=sc.next();
       serv.insertdata(student_id,name,stream);
       System.out.println("Successfully inserted");
       
       break;
       
        case 2:
          ServiceImpl service=new ServiceImpl();
          ArrayList<Student> arr1=new ArrayList<Student>();
    	  System.out.println("enter student id");
    	  int id=sc.nextInt();
    	  System.out.println("enter student name");
    	  String student_name=sc.next();
    	 arr1= service.update(student_name, id);
    	  for(Student s:arr1) {
    		  System.out.println(s.getName()+ " "+ s.getStream() + " " + s.getStudent_id());
    	  }
    	  
    	  break;
	}
	}

	}

