package com.makemytrip;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

	public static Properties loadData() {
		Properties p= new Properties();
		InputStream input=null;
		
		try {
			input= new FileInputStream("D:\\SPringBoot\\Workspace\\com.mindtree\\src\\main\\java\\com\\makemytrip\\BrowserLaunch.properties");
	        p.load(input);
	        p.getProperty("path");
	        p.getProperty("property");
	        p.getProperty("url");
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
		
	}
}
