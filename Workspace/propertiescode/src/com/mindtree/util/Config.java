package com.mindtree.util;
import java.util.*;
import java.io.*;
public class Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p= new Properties();
		InputStream input= null;
		try {
		
       input= new FileInputStream("Data.properties");
       p.load(input);
       System.out.println(p.getProperty("username"));
       System.out.println(p.getProperty("driver_name"));
       System.out.println(p.getProperty("password"));
       System.out.println(p.getProperty("url"));
	}catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

}
}
}

//to get contents of the properties file