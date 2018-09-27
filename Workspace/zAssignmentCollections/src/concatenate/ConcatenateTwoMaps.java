package concatenate;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ConcatenateTwoMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<Integer,String> hm1= new HashMap<Integer,String>();
    hm1.put(1, "Red");
    hm1.put(2, "Blue");
    hm1.put(3, "Yellow");
    HashMap<Integer,String> hm2= new HashMap<Integer,String>();
    hm2.put(4, "Green");
    hm2.put(5, "Pink");
    hm2.put(6, "Black");
    
    Set<Map.Entry<Integer,String>> set= hm2.entrySet();
    for(Map.Entry<Integer, String> m:set) {
    	hm1.put(m.getKey(),m.getValue());
    }
    for(Map.Entry<Integer,String> m1:hm1.entrySet()) {
    	System.out.println("key " + m1.getKey());
    	System.out.println("value " + m1.getValue());
    }
	}

}
