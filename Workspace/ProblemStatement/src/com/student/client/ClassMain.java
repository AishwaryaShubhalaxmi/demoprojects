package com.student.client;
import java.sql.SQLException;
import java.util.*;

import com.student.exception.DaoException;
import com.student.service.Serviceimplementation;
public class ClassMain {

	public static void main(String[] args) throws SQLException, DaoException  {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      System.out.println("1. Get the marks of all students");
      System.out.println("2.Insert marks of students");
      System.out.println("Enter your choice: ");
      int choice= sc.nextInt();
      switch(choice){
    	  case 1:Serviceimplementation.display();
           break;
    		
    	  case 2:Serviceimplementation.insertData();
    	  break;
      }
      
	}

}
