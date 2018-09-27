package com.student.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.student.entity.Student;
import com.student.utility.Utility;

public class DaoImpl extends Utility{
   
   public void insert(int student_id,String name,String stream) {
   Utility.getConnection();
   String query="insert into student(student_id,name,stream)" + "values(?,?,?) ";
   
   try {
	PreparedStatement stmt=con.prepareStatement(query);
	stmt.setInt(1,student_id);
	stmt.setString(2, name);
	stmt.setString(3, stream);
	
	stmt.execute();
	
	} catch (SQLException e) {
  System.out.println(e.getMessage());
	
}
   }
   public ArrayList<Student> update(String name,int student_id){
	   Utility.getConnection();
	   ArrayList<Student> arr= new ArrayList<Student>();
	   Student s= new Student();
	   String query="update student set name=?  where id=? ";
	   try {
		PreparedStatement stmt=con.prepareStatement(query);
		stmt.setString(1, name);
		stmt.setInt(2, student_id);
		ResultSet rs= stmt.executeQuery();
		while(rs.next()) {
			s=new Student(rs.getInt(1),rs.getString(2));
			arr.add(s);
		}
	} catch (SQLException e) {
		System.out.println(e.getMessage());
		
	}
	return arr;
   }
	   
	   
   }
   
   

