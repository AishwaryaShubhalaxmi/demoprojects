package com.fileHandling.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.fileHandling.entity.User;
import com.fileHandling.utility.Utility;

public class DaoImpl {
public void insertData(ArrayList<User> user){
	Utility util=new Utility();
	Connection con= util.getConnection();
	for(int i=0;i<user.size();i++) {
		try {
			PreparedStatement stmt=con.prepareStatement("insert into info(mid,name,doj,role) values(?,?,?,?);");
			stmt.setString(1,user.get(i).getMid());
			stmt.setString(2, user.get(i).getName());
			SimpleDateFormat date=new SimpleDateFormat("dd-MM-yyyy");
			String st= date.format(user.get(i).getDoj());
			stmt.setString(3, st);
			stmt.setString(4, user.get(i).getRole());
			stmt.executeUpdate();
			} catch (SQLException e) {
			System.out.println("Error");
		}
	}
	
	
}
    public User readData(String mid) {
    	Utility util=new Utility();
    	Connection con= util.getConnection();
    	User u=null;
    	try {
			PreparedStatement ps=con.prepareStatement("select * from user where mid=?");
			ps.setString(1, mid);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				 u=new User(rs.getString(1),rs.getString(2),rs.getDate(3),rs.getString(4));
			}
			
		} catch (SQLException e) {
			System.out.println("Error");
		}
    	return u;
    }
}
