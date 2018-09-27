package hashMapSortByKey;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class SortByKey {

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
    System.out.println("Before Sorting: ");
    for(Map.Entry<Integer, String> m:hm.entrySet()) {
    	System.out.println("key " + m.getKey());
    	System.out.println("value " + m.getValue());}
    
   /* Iterator<Map.Entry<Integer,String>> itr= hm.entrySet().iterator();
    while(itr.hasNext()) {
    	Map.Entry<Integer,String> entry= itr.next();
    	System.out.println("key " + entry.getKey() + " " + "value " + entry.getValue());
    }*/
    ArrayList<Integer> arr= new ArrayList<Integer>(hm.keySet());
    Collections.sort(arr);
    System.out.println("After sorting by keys: ");
    for(int x:arr) {
    	System.out.println("key " + x + "value " + hm.get(x));
    }
	}
   
}

