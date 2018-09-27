package com.framework.resusable;
import java.io.FileInputStream;
import java.util.Properties;


public class ReadFromProperties {
     public void readProperties() throws Exception {
	FileInputStream file= new FileInputStream("config.properties");
	Properties p= new Properties();
	p.load(file);
     }
     
}
