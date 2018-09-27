package com.cmdLine.client;

import java.util.ArrayList;

import com.cmdLine.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
	  System.out.println("The id of employees are");
	  ArrayList<Integer> arr= new ArrayList<Integer>();
      for(int i=0;i<6;i++) {
    	 num=Integer.parseInt(args[i]);
    	Employee e=new Employee();
    	e.setId(num);
    	arr.add(num);
       }
      
       for(Integer i:arr) {
    	   System.out.print(i + " ");
       }
       
	}
   
}
