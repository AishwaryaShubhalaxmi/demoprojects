package com.sdet.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import com.sdet.service.ServiceImpl;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a string");
     String st=sc.nextLine();
     String[] s= st.split(" ");
     HashMap<String,Integer> hm= new HashMap<String,Integer>();
     ServiceImpl serv=new ServiceImpl();
     hm=serv.countFrequency(s);
     for(Entry<String, Integer> hm1:hm.entrySet()) {
    	 System.out.println("key " + hm1.getKey());
    	 System.out.println("values " + hm1.getValue());
    	
     }
	}

}
