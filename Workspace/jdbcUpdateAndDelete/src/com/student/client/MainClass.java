package com.student.client;
import java.util.Scanner;

import com.student.dao.DaoImpl;
import com.student.entity.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Student s= new Student();
		DaoImpl obj=new DaoImpl();
     System.out.println("1. Update Element");
     System.out.println("2. Delete Element");
     System.out.println("Enter your choice");
     int choice=sc.nextInt();
     switch(choice) {
     case 1:
     	 System.out.println("Enter student no");
     	 String student_no= sc.next();
    	  s.setStudent_no(student_no);
    	 System.out.println("Enter student surname");
    	 String surname=sc.next();
    	 s.setSurname(surname);
    	obj.updateData(surname, student_no);
    	 break;
    	 
     case 2:
    	 System.out.println("Enter forename");
    	 String forename=sc.next();
    	 s.setForename(forename);
    	 obj.deleteData(forename);
    	 break;
     }
	}

	}


