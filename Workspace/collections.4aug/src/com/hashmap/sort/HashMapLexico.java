package com.hashmap.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapLexico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashMap<Integer,String> hm= new HashMap<Integer,String>();
   hm.put(1, "Red");
   hm.put(2, "Yellow");
   hm.put(3, "Green");
   hm.put(4, "Pink");
   hm.put(5,"Blue" );
   int cnt=0;
   System.out.println("Before Sorting");
   for(Entry<Integer, String> m:hm.entrySet()) {
	   int key=m.getKey();
	   String s=m.getValue();
	   System.out.println("key " + key);
	   System.out.println("value " + s);
   }
   Set<Map.Entry<Integer,String>> set= hm.entrySet();
   ArrayList<Map.Entry<Integer,String>> arr= new ArrayList<Map.Entry<Integer,String>>(set);
   Collections.sort(arr, new CompareByValue());
   System.out.println("After sorting");
   for(Map.Entry<Integer, String> m:arr) {
	  
	   
	   System.out.println("key " + m.getKey());
	   System.out.println("value " + m.getValue());
	   }
   System.out.println("largest and smallest");
   for(Map.Entry<Integer, String> m:arr) {
	  
	   for(Map.Entry<Integer, String> m1:arr) {
		   cnt++;
		  if(cnt==1 || cnt==arr.size()) {
	   System.out.println("key " + m1.getKey());
	   System.out.println("value " + m1.getValue());
	   }
   
	}
   }
	}
}

