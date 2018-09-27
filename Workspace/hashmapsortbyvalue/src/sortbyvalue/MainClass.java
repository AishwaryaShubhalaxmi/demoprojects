package sortbyvalue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MainClass {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc= new Scanner(System.in);
	  HashMap<Integer,Student> hm= new HashMap<Integer,Student>();
       System.out.println("enter size");
       int n=sc.nextInt();
       for(int i=0;i<n;i++) {
    	Student st= new Student();
    	System.out.println("enter marks");
    	int marks=sc.nextInt();
    	System.out.println("enter name");
    	st.setName(sc.next());
    	System.out.println("enter id");
    	st.setId(sc.nextInt());
    	hm.put(marks, st);
    }
      System.out.println("Before sorting:");
      for(Map.Entry<Integer, Student> m: hm.entrySet()) {
    	  System.out.println("key" + " " + m.getKey());
    	  Student s= m.getValue();
    	  System.out.println("values " + " " + s.getId() + " " + s.getName());
      }
	
	}
//	  
//      Set<Map.Entry<Integer, Student>> set=hm.entrySet();
//      List<Entry<Integer, Student>> list = new ArrayList<Entry<Integer, Student>>(set);
//      Collections.sort(list, new Comparator<Map.Entry<Integer, Student>>() {
//          public int compare(Map.Entry< Integer,Student> o1, Map.Entry<Integer,Student> o2) {
//              return o2.getValue().compareTo(o1.getValue());}
//          for (Entry<String, Integer> entry : list) {
//          System.out.println(entry.getValue());
//
//      }

      
      
      
	
	
	}    


