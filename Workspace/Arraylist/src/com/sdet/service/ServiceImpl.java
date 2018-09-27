package com.sdet.service;

import java.util.ArrayList;

public class ServiceImpl {
	public String reverseSentence(ArrayList<String> al) {
		String result = " ";
		for (int i =0; i <al.size(); i++) {
		StringBuilder str = new StringBuilder(al.get(i));
			str.reverse();
			result += (str.reverse());
		}
		return result;
	} 
	}

