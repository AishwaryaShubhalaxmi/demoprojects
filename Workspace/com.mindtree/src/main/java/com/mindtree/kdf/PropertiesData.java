package com.mindtree.kdf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesData {

 public static int rownum;
 public static int columnNum;
 public static int sheetIndex;
 public static String sheetPath;
 
 public void readProperties() throws Exception {
	 Properties p= new Properties();
	 InputStream input=null;
	
	 
       input = new FileInputStream("D:\\SPringBoot\\Workspace\\propertiescode\\kdf1.properties");
		 p.load(input);
		rownum= Integer.parseInt(p.getProperty("rownum"));
		columnNum=Integer.parseInt(p.getProperty("columnNum"));
		sheetIndex=Integer.parseInt(p.getProperty("sheetIndex"));
		sheetPath=p.getProperty("sheetPath");
		 
	
	 
	
 }
	
	
}
