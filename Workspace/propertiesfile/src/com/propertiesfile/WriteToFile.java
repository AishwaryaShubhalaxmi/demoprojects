package com.propertiesfile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Properties p= new Properties();
		    OutputStream output=null;
		    try {
				output=new FileOutputStream("config.properties");
			    p.setProperty("username", "aishwarya");
			    p.setProperty("password", "aish");
				p.store(output, null);
			} catch (IOException e) {
				e.printStackTrace();
			
		   
			
			}finally {
		     if(output!=null) {
		    	 try {
					output.close();
				} catch (IOException e) {

			     e.printStackTrace();
				}
		    	 System.out.println("Successfully written");
		     }
			}
	}

}
