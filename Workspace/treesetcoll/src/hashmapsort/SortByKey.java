package hashmapsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SortByKey {
 public void sortbykey() {
	 HashMap<Integer,String> hm1= new HashMap<Integer,String>();
	 ArrayList<Integer> arr= new ArrayList<Integer>(hm1.keySet());
	 Collections.sort(arr);
     for(int x:arr) {
    	 System.out.println("key " + x);
    	 System.out.println("value " + hm1.get(x));
     }
 }
}
