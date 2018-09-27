 package com.propertiesfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Properties p= new Properties();
    InputStream input=null;
    
    try {
		input= new FileInputStream("config.properties");
		
		p.load(input);
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));	
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}finally {
		if(input!=null) {
			try {
				input.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
	}
    
	}

}
