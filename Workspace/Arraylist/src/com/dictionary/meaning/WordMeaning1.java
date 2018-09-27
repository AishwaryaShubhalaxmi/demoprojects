package com.dictionary.meaning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordMeaning1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a word");
		String word = sc.next();
		hm.put("A penny for your thoughts", "A way of asking what someone is thinking");
		hm.put("Actions speak louder than words",
				"People's intentions can be judged better by what they do than what they say.");
		hm.put("Add insult to injury",
				"To further a loss with mockery or indignity; to worsen an unfavorable situation.");
		for (Map.Entry<String, String> entry : hm.entrySet()) {
			if (entry.getKey().contains(word) || entry.getValue().contains(word)) {
				System.out.println("The word is: " + entry.getKey());
				System.out.println("The meaning is: " + entry.getValue());

			}
		}

	}
}
