package com.count.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter sentence");
		String sen=sc.nextLine();
		String[] arr=sen.split("\\W");
		int count=1;
		HashMap<String,Integer> hm= new HashMap<String,Integer>();
		for(String word: arr) {
			String newWord=word.toLowerCase();
			if(hm.containsKey(newWord)) {
				hm.put(newWord, hm.get(newWord)+1);
			
			}
			else {
				hm.put(newWord, 1);
			}
		}
		for(Map.Entry<String, Integer>map:hm.entrySet()) {
			System.out.println(map.getKey());
			System.out.println(map.getValue());
		
		}
	}

}