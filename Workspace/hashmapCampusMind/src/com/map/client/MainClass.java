package com.map.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.map.entity.CampusMind;
import com.map.service.CompareByDoj;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<String,CampusMind> hm= new HashMap<String,CampusMind>();
    Scanner sc= new Scanner(System.in);
        	for(int i=0;i<6;i++) {
    		CampusMind cm= new CampusMind();
    		System.out.println("Enter mid");
    		String mid=sc.next();
    		System.out.println("Enter name");
    	    cm.setName(sc.next());	
    	    System.out.println("Enter track");
    	    cm.setTrack(sc.next());
    	    System.out.println("Enter doj");
    	    String date=sc.next();
    	    try {
				Date doj=new SimpleDateFormat("dd/MM/yyyy").parse(date);
				cm.setDoj(doj);
			} catch (ParseException e) {
				System.out.println(e.getMessage());
			}
    	    hm.put(mid, cm);
    	    }
    	   System.out.println("Before Sorting");
    	   for(Map.Entry<String,CampusMind> m:hm.entrySet()) {
    		String key=m.getKey();
    		CampusMind c=m.getValue();
    		System.out.println("key " + key);
    		System.out.println("values: " + c.getName() + " " + c.getTrack() + " " + c.getDoj());
    	}
    	
    	Set<Map.Entry<String,CampusMind>> set= hm.entrySet();
    	ArrayList<Map.Entry<String,CampusMind>> list= new ArrayList<Map.Entry<String,CampusMind>>(set);
        Collections.sort(list, new CompareByDoj());
    	System.out.println("After Sorting: ");
    	for(Map.Entry<String, CampusMind> map:list) {
    		String key=map.getKey();
    		System.out.println("key " + key);
    		CampusMind camp=map.getValue();
    		System.out.println(camp.getName() + " " +camp.getTrack() + camp.getDoj() );
    	}
           
    	}
    
    }
	


