package com.hashmap.sort;

import java.util.Comparator;
import java.util.Map;

public class CompareByValue implements Comparator<Map.Entry<Integer,String>>{
	public int compare(Map.Entry<Integer, String> ob1,Map.Entry<Integer, String> ob2 ) {
		  return ob1.getValue().compareTo(ob2.getValue());
	}

}
