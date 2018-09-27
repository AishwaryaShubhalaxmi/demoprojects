package com.map.client;

import java.util.HashMap;

import com.map.service.SortBbyKey;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
	HashMap<String,CampusMind> mind= new HashMap<String,CampusMind>();
	SortBbyKey s= new SortBbyKey();
       for(int i=0;i<3;i++) {
    	CampusMind cm=new CampusMind();
		System.out.println("Enter mid");
		String mid=sc.next();
	    System.out.println("Enter name");
		String name=sc.next();
		cm.setName(name);
		System.out.println("Enter track");
		String track=sc.next();
		cm.setTrack(track);
		System.out.println("Enter doj");
		String date=sc.next();
		try {
			Date doj=new SimpleDateFormat("dd/MM/yyyy").parse(date);
			cm.setDoj(doj);
		} catch (ParseException e) {
            e.printStackTrace();
		}
		mind.put(mid, cm);
	
	}
     System.out.println("Before sorting:");
	for(Map.Entry<String,CampusMind> m: mind.entrySet()) {
		String key=m.getKey();
		CampusMind min=m.getValue();
    	System.out.println("key= " + key);
    	System.out.println(min.getName() + " " + min.getTrack() + " " + min.getDoj());
	}
	
	System.out.println("After sorting:");
	SortBbyKey.sortByKey();
	for(Map.Entry<String,CampusMind> m: mind.entrySet()) {
		String key=m.getKey();
		CampusMind min=m.getValue();
    	System.out.println("key= " + key);
    	System.out.println(min.getName() + " " + min.getTrack() + " " + min.getDoj());
	}
		
	
	
		
	
	
}
}
