package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Set;

import com.student.entity.Student;
import com.student.util.Utility;

public class DaoImpl {
	Utility util = new Utility();
	Connection con;

	public void insert(Set<Student> set) {
		con = util.openConnection();
		PreparedStatement stmt = null;
		String query = "insert into students values(?,?,?)";
		try {
			for (Student student : set) {
				stmt = con.prepareStatement(query);
				stmt.setInt(1, student.getId());
				stmt.setString(2, student.getName());
				stmt.setFloat(3, student.getMarks());
			}
			stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Student> fetchdata() {
		con = util.openConnection();
		ArrayList<Student> arr3 = new ArrayList<Student>();
		Student student = null;
		try {

			Statement stmt = con.createStatement();
			ResultSet rs;
			String query = "select * from students";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				student = new Student(rs.getInt(1), rs.getString(2), rs.getFloat(3));
				arr3.add(student);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arr3;

	}

}
