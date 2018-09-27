package com.student.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utility {
 protected static Connection con;
 
 public static  Connection getConnection() {
	 try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","Welcome123");
	} catch (ClassNotFoundException e) {
	   System.out.println(e.getMessage());}
	  catch(SQLException e1) {
		  System.out.println(e1.getMessage());
	  }
	 return con;
	
	}
	 
 public  void closeConnection() {
	 try {
		con.close();
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
 }
 }

