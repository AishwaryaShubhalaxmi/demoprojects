package com.cmdLine.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class Util {
    private static Connection con;
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Welcome123");
			
		} catch (Exception e) {
		 System.out.println(e);
			
		}
		return con;
	}
}
