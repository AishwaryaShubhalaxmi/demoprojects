package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.jdbc.exceptions.DBUtilEXCeption;

public class Utility {
 private static Connection con;
public Connection getConnection() throws DBUtilEXCeption 
{
	try {
		Class.forName("com.mysql.jdbc.Driver");
		}
	catch( ClassNotFoundException e) {
		throw new DBUtilEXCeption(e.getMessage());
		}
		try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/players","root","Welcome123");}
	   catch(SQLException e) {
		   throw new DBUtilEXCeption(e.getMessage());
	
	}
	return con;
}

public void closeConnection() {
	try {
		con.close();
	} catch (SQLException e) {
		System.out.println(e);
		
	}
}
}
