package com.play.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class util {

	static Connection con;
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");}
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/players_jdbc","root","Welcome123");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}
		return con;
		
	}
	
	public void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
	     System.out.println(e.getMessage());		
	
		}
	}
}
