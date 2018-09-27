package com.mindtree.client;

import com.mindtree.service.Factorial;
import com.mindtree.service.Fibonacci;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Factorial f=new Factorial();
		    Thread t1= new Thread(f);
		     
		     Fibonacci t2= new Fibonacci();
		    
		     
		      t1.setPriority(Thread.MIN_PRIORITY);
		      t2.setPriority(Thread.MAX_PRIORITY);
		      t1.setName("Factorial");
		      t2.setName("Fibonacci");
		      System.out.println("for factorial of 5 using " + t1.getName());
		       t1.start();
		       
		       System.out.println("for fibonacci of 5 using " + t2.getName()); 
		       t2.start();
		       
		      
	}

}
