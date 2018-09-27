package hashmapsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SortCode {
	static HashMap<Integer,String> hm= new HashMap<Integer,String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
     Scanner sc= new Scanner(System.in);
     for(int i=0;i<3;i++) {
     System.out.println("enter name");
     String name=sc.next();
     System.out.println("enter id");
     int id=sc.nextInt();
     hm.put(id, name);
	}
     System.out.println("Before Sorting:");
    for(Map.Entry<Integer, String> m:hm.entrySet()) {
    	System.out.println("key " + m.getKey());
    	System.out.println("value " + m.getValue());
    }
    System.out.println("After Sorting:");
    sortbykey();
	}
   
    public static void sortbykey() {
     
   	
   	 ArrayList<Integer> arr= new ArrayList<Integer>(hm.keySet());
   	 Collections.sort(arr);
        for(int x:arr) {
       	 System.out.println("key " + x);
       	 System.out.println("value " + hm.get(x));
        }
    
   
    
 	}
}
