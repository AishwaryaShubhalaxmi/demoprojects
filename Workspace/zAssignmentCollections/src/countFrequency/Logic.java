package countFrequency;

import java.util.HashMap;

public class Logic {
	public HashMap<String,Integer> countFrequency(String[] arr){
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		for(String s:arr) {
			if(hm.containsKey(s)) {
				hm.put(s, hm.get(s)+1);
			}
			else {
				hm.put(s, 1);
			}
		}
		return hm;
	}

}
