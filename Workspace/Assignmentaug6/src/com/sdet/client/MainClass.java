package com.sdet.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);	
 ArrayList<String> arr= new ArrayList<String>();
 System.out.println("Enter a string");
 String s= sc.nextLine();
String[] st= s.split(" ");
 for(int i=0;i<st.length;i++) {
	 arr.add(st[i]);
 }
 System.out.println("Before reversing:");
 for(String str:arr) {
	System.out.print(str + " "); 
 }
 System.out.println("After Reversing:");
 Collections.reverse(arr);
 for(String str1:arr) {
	 System.out.print(str1 + " ");
 }


}
}