package com.fileHandling.utility;
/**
 * For database connection
 */

import java.sql.*;

public class Utility {
	
private static Connection con;
	
 public static Connection getConnection() {    //To get the connection
	 try {
	 Class.forName("com.mysql.jdbc.Driver");
	 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/filereading","root","Welcome123");
	 }catch(Exception e) {
		 System.out.println("Exception caught");
	 }
	 return con;
	 
}
 public static void closeConnection() {    //To close the connection
	 try {
	 con.close();
 }catch(Exception e) {
	 System.out.println("Exception caught");
 }
}
}