package com.fight.makmytrip;

public class BookingValidation {
  public static void validate(String index1, String index2,String id1, String id2) {
	  if(index1.substring(0, 6).equals(id1.substring(0, 6))) {
		  System.out.println("index1 is verified");
	  }
	  if(index2.substring(0, 6).equals(id2.substring(0, 6))) {
		  System.out.println("index2 is verified");
	  }
  }

}
