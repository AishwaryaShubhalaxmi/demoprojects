package com.student.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Utility {

	
	public static Connection con;
	public Connection openConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "Welcome123");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		return con;
		
		
	}
	
	public void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
