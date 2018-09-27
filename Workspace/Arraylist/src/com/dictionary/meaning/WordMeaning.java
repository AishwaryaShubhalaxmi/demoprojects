package com.dictionary.meaning;
import java.util.HashMap;
import java.util.Scanner;

public class WordMeaning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        HashMap<String,String> hm= new HashMap<String,String>();
		hm.put("a", "apple");
		hm.put("b", "ball");
		hm.put("c", "cat");
		hm.put("d", "dog");
		hm.put("e", "egg");
		System.out.println("enter any word");
		String word= sc.next();
		if(hm.containsKey(word)) {
			String meaning= hm.get(word);
			System.out.println(meaning);
			}
		else {
			System.out.println("word not present in dictionary");
		
		}
		
		
	}

}
