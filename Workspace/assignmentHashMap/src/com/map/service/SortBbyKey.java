package com.map.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import com.map.client.CampusMind;

public class SortBbyKey {
  public static void sortByKey() {
	    HashMap<String,CampusMind> hm=new HashMap<String,CampusMind>();
		ArrayList<String> sortedKeys= new ArrayList<String>(hm.keySet());
		Collections.sort(sortedKeys);
//		for(String str: sortedKeys) {
//			System.out.println("key= " + str + " values  " + hm.get(str) );
//		}
	}
}
