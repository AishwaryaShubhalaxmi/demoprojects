package com.ddf.utility;
import java.io.FileInputStream;
import java.util.Properties;

public class Utility {

	public Object fetchProperty(String key) throws Exception {
		FileInputStream file= new FileInputStream("D:\\SPringBoot\\dataDrivenFramework\\Config\\config.properties");
		Properties p= new Properties();
		p.load(file);
		return p.getProperty(key);
		
	}
	
	public String fetchLocators(String key) throws Exception {
		FileInputStream file1= new FileInputStream("D:\\SPringBoot\\dataDrivenFramework\\Config\\locators.properties");
		Properties p= new Properties();
		p.load(file1);
		return p.getProperty(key);
		
	}
}
