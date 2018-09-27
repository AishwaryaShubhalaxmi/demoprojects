package com.mindtree.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utility {
	
    private static Connection con;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/basecamp","root","Welcome123");
			}catch(Exception e){
				System.out.println(e);
			}
			return con;
	}
	
	public void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Failed to close connection");
		}
	}
}
