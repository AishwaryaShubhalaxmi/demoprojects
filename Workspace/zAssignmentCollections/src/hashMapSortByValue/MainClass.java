package hashMapSortByValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<Integer,String> hm= new HashMap<Integer,String>();
    Scanner sc= new Scanner(System.in);
    System.out.println("enter size");
    int n=sc.nextInt();
    for(int i=0;i<n;i++) {
    System.out.println("Enter key");
    int k=sc.nextInt();
    System.out.println("Enter value");
    String val=sc.next();
    hm.put(k, val);
    }
     System.out.println("Before Sorting:" );
     for(Map.Entry<Integer,String> m:hm.entrySet()) {
    	 System.out.println("key " + m.getKey());
    	 System.out.println("value " + m.getValue());
     }
     System.out.println("After Sorting:");
     Set<Map.Entry<Integer,String>> set= hm.entrySet();
     ArrayList<Map.Entry<Integer,String>> arr= new ArrayList<Map.Entry<Integer,String>>(set);
     Collections.sort(arr, new CompareByValue());
     for(Map.Entry<Integer, String> m1: arr) {
    	 System.out.println("key " + m1.getKey());
    	 System.out.println("value " + m1.getValue());
     }
	}

}
