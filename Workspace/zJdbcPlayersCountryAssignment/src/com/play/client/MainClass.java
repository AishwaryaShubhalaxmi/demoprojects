package com.play.client;

import java.util.Scanner;
import com.play.service.ServiceImpl;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     ServiceImpl serv= new ServiceImpl();
     System.out.println("Enter your choice:");
     System.out.println("1.Insert 2.Select 3.Delete 4.Update");
     int choice=sc.nextInt();
     switch(choice) {
     case 1:
    	 
    	 System.out.println("enter the size");
    	 int n=sc.nextInt();
    	 for(int i=0;i<n;i++) {
    		 System.out.println("enter player id");
    		 int player_id=sc.nextInt();
    		 System.out.println("enter country id");
    		 int country_id=sc.nextInt();
    		 System.out.println("enter player name");
    		 String player_name=sc.next();
    		 System.out.println("enter runs made ");
    		 int runs_made=sc.nextInt();
    		 System.out.println("enter wickets taken");
    		 int wickets_taken=sc.nextInt();
    		 serv.insertion(player_id, country_id, player_name, runs_made, wickets_taken);
    		}
    	 System.out.println("Data inserted successfully");
    	 break;
     case 2:
    	 serv.selection();
    
         System.out.println("Data selected successfuly");
    	  break;
     case 3:
    	 break;
     case 4:
    	 break;
     }
     
	}

}
