package com.sdet.service;

import java.util.HashMap;

public class ServiceImpl {

	public HashMap<String,Integer> countFrequency(String[] s){
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(String str: s) {
			if(hm.containsKey(str)) {
				hm.put(str, hm.get(str) + 1);
			}
			else
				hm.put(str,1);
		}
		return hm;
		
	}
}
