package com.fileHandling.Client;
import java.io.FileNotFoundException;
import java.util.*;

import com.fileHandling.Service.ServiceImpl;
import com.fileHandling.entity.User;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      ServiceImpl service=new ServiceImpl();
      User u=new User();
      System.out.println("1.Read data from file");
      System.out.println("2.Write data to file");
      System.out.println("Enter your choice:");
      int choice=sc.nextInt();
      switch(choice) {
      case 1:
    	    String s=service.readFromFile();
			System.out.println(s);
			break; 
      case 2:
    	/*  System.out.println("enter mid");
    	  String mid=sc.next();
    	  String s1=service.writeToFile(mid);
    	  System.out.println(s1);
    	  break;
      } */
	
	}

	}
}
