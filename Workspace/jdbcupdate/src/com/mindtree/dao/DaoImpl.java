package com.mindtree.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mindtree.entity.Student;
import com.mindtree.util.Utility;

public class DaoImpl {
    Student s=new Student();
    public void updateData(String surname, String student_no ) {
	Utility util=new Utility();  //create object of util class
	Connection con=util.getConnection(); //use the object to get connection
	try {
		PreparedStatement ps=con.prepareStatement("update students set surname=? where student_no=?");
		ps.setString(1,surname );
		ps.setString(2, student_no);
		
		ps.executeUpdate();
		System.out.println("Updated");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
    public void deleteData(String forename) {
    	Utility util=new Utility();
    	Connection con=util.getConnection();
    	try {
    		PreparedStatement stmt=con.prepareStatement("delete from students where forename=?");
    		stmt.setString(1, forename);
    		stmt.executeUpdate();
    		System.out.println("Deleted");
    		
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    }
}