package com.mindtree.entity;
import java.util.*;
import java.text.*;

public class StringToDate {
static void String_Date() throws Exception{
	Scanner sc= new Scanner(System.in);
    System.out.println("Enter the date in dd/MM/yyyy format");
    String date=sc.next();
    Date date1= new SimpleDateFormat("dd/MM/yyyy").parse(date);
    System.out.println(date1);
}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
      String_Date();
	}

}
