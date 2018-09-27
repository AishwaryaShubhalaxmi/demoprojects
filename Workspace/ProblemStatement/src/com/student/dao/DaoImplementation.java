package com.student.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import com.student.exception.*;
import java.sql.PreparedStatement;
import com.student.entity.Student;
import com.student.entity.Subject;
import com.student.util.Utility;

public class DaoImplementation {
	public static ArrayList<Subject> getMarksScored(int id) throws DaoException{

		
		ArrayList<Subject> list= new ArrayList<>();
		try {
			Subject subject=null;
			Utility util=new Utility();
			Connection con=util.getConnection();
			String query="select s.st_name,sub.s_id,sum(sub.marks) from subject sub inner join student s on sub.s_id=s.s_id group by sub.s_id having sub.s_id=?";
			PreparedStatement st=con.prepareStatement(query);
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				subject = new Subject(rs.getString(1), rs.getInt(2),rs.getInt(3));
			//	System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3));
				list.add(subject);
				   
				    			
			}
			
		} catch (SQLException e) {
			System.out.println(e);
			throw new DaoException(e);
		}
		return list;
	}
			
	public static void insertMarks(Subject sub) throws DaoException {
		try{
			
		Utility obj = new Utility();
		Connection con = obj.getConnection();
		String query = " insert into subject values (?,?,?,?)";
		PreparedStatement preparedStmt = con.prepareStatement(query);
		preparedStmt.setInt(1, sub.getSub_id());
		preparedStmt.setString(2, sub.getSub_name());
		preparedStmt.setInt(3, sub.getMarks());
		preparedStmt.setInt(4, sub.getS_id());
		preparedStmt.executeUpdate();
	
		con.close();
		}catch(SQLException e){
			throw new DaoException(e);
		
			
		}
		
		 
	 }
	}
	
  
