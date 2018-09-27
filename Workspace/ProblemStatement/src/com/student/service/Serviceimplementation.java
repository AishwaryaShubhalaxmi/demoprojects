package com.student.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.student.dao.DaoImplementation;
import com.student.entity.Student;
import com.student.entity.Subject;
import com.student.exception.DaoException;

public class Serviceimplementation {
	static Scanner sc=new Scanner(System.in);
	
	//To display the marks of a student
  public static void display() throws DaoException {
   System.out.println("Enter student id");
   int id=sc.nextInt();
   Student s=new Student();
   s.setSt_id(id);
   DaoImplementation.getMarksScored(id);

   
}
  
  //To insert the marks of a student

 public static void insertData() throws  DaoException
 {
	 Subject st=new Subject();
	 System.out.println("Enter subject id");
	 int sub_id=sc.nextInt();
	 System.out.println("Enter subject name");
	 String sub_name=sc.next();
	 System.out.println("Enter marks");
	 int marks=sc.nextInt();
	 System.out.println("Enter student id");
	 int st_id=sc.nextInt();
	 st.setSub_id(sub_id);
	 st.setSub_name(sub_name);
	 st.setMarks(marks);
	 st.setS_id(st_id);
	 DaoImplementation.insertMarks(st);
	
	 
 }
}
