package com.sdet.client;

import java.util.ArrayList;
import java.util.Scanner;

import com.sdet.service.ServiceImpl;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		ServiceImpl serv = new ServiceImpl();
		System.out.println("Enter a string");
		String st = sc.nextLine();
		String[] str = st.split(" ");
		for (int i = 0; i < str.length; i++) {
			arr.add(str[i]);
		}
		System.out.println("Before reversing");
		for (String s : arr) {
			System.out.println(s+ " ");
		}

		
		System.out.println("After reversing:");
		String result = serv.reverseSentence(arr);

		System.out.print(result + " ");
	}

}
