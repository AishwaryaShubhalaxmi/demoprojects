package com.excel.read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {
	 FileInputStream input=null;
	static String chromePath=null;
	static  String excelPath=null;
	static String sheetName=null;
  public void readProperties() {
	  Properties p=new Properties();
	  try {
		input= new FileInputStream("details.properties");
		p.load(input);
		chromePath  =p.getProperty("chromepath");
	    excelPath=p.getProperty("Excelpath");
	    sheetName=p.getProperty("sheetname");
	} catch (FileNotFoundException e) {
	
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	  
  }
}
