package com.mindtree.entity;
import java.util.*;
import java.text.*;


public class MainClass {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String s="30/06/2018";
	  Date date=new SimpleDateFormat("dd/MM/yyyy").parse(s); 
	  String s1="25/06/2018";
	  Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(s1);
	  String s2="28/06/2018";
	  Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(s2);
	  String s3="21/06/2018";
	  Date date3=new SimpleDateFormat("dd/MM/yyyy").parse(s3);
	  String s4="29/06/2018";
	  Date date4=new SimpleDateFormat("dd/MM/yyyy").parse(s4);
	  
	 CampusMind m1= new CampusMind("Aish","M1046926",date ,20);
      CampusMind m2= new CampusMind("Soma","M1046929", date1,25);
      CampusMind m3= new CampusMind("Ankit","M1046932", date2,30);
      CampusMind m4= new CampusMind("Debu","M1046924", date3,35);
      CampusMind m5= new CampusMind("Ujwala","M1046930", date4,40);
	 
      ArrayList<CampusMind> arr= new ArrayList<CampusMind>();
      
	   arr.add(m1);
	   arr.add(m2);
	   arr.add(m3);
	   arr.add(m4);
	   arr.add(m5);
	   System.out.println("Before sorting:");
	   for(CampusMind m:arr) {
		   System.out.println(m.getName() + " " + m.getmID() + " " + m.getDoj() + " " + m.getOrhardScore());
	   }
	   System.out.println("After sorting:"); 
	  
	   Collections.sort(arr);
	 
	   Iterator<CampusMind> itr= arr.iterator();      
       while(itr.hasNext()){
    	   CampusMind m= itr.next();
    	   System.out.println(m.getName() + " " + m.getmID() + " " + m.getDoj() + " " + m.getOrhardScore());
       }
	  
	    }
	    		
	    	 
	     
	   
	}


