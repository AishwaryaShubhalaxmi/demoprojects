package com.keyword.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	Properties p= new Properties();
	public Properties getObjectRepository() {
		
	try {
FileInputStream input= new FileInputStream(new File(System.getProperty("D:\\SPringBoot\\Workspace\\com.mindtree\\com.keyword.objects\\object.properties")));
	   p.load(input);
	
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	return p;
	}
	
	
}
