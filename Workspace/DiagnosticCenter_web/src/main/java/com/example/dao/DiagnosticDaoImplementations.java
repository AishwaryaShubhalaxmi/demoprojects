package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//import com.mindtree.entity.InvalidEmailIdException;

import com.example.entity.*;
import com.example.utility.Utility;

public class DiagnosticDaoImplementations implements DiagnosticDao {

	public Patient fetchByEmail(String email) {
		Patient p = null;
		try {
			Utility obj = new Utility();
			Connection con = obj.getConnection();

			String query = "select * from patient where email='" + email + "'";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while (rs.next())
				p = new Patient(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
		} catch (Exception e) {
			System.out.println(e);
		}
		return p;
	}

	public Patient fetchByPhone(String pNumber) {
		Patient p = null;
		try {
			Utility obj = new Utility();
			Connection con = obj.getConnection();

			String query = "select * from patient where phone=?;";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setString(1, pNumber);
			ResultSet rs = preparedStmt.executeQuery();
			while (rs.next())
				p = new Patient(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
		} catch (Exception e) {
			System.out.println(e);
		}
		return p;

	}

	@Override
	public Test fetchByTest(String tName) {
		Test t = null;
		try {
			Utility obj = new Utility();
			Connection con = obj.getConnection();

			String query = "select * from test where name=?;";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setString(1, tName);
			ResultSet rs = preparedStmt.executeQuery();
			while (rs.next())
				t = new Test(rs.getInt(1), rs.getString(2), rs.getInt(3));
		} catch (Exception e) {
			System.out.println(e);
		}
		return t;
	}

	@Override
	public boolean putPatientTests(int pId, int tId) {
		Connection con = null;
		try {
			Utility obj = new Utility();
			con = obj.getConnection();
			String query = " insert into patient_test(P_ID,T_ID,DATE)" + " values (?, ?, ?)";

			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setInt(1, pId);
			preparedStmt.setInt(2, tId);
			preparedStmt.setString(3, LocalDate.now().toString().trim());

			preparedStmt.executeUpdate();

			return true;
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;

	}

	@Override
	public ArrayList<Report> fetchCost(int pId, String date) {
		ArrayList<Report> r = new ArrayList<Report>();
		Report report = null;
		try {
			Utility obj = new Utility();
			Connection con = obj.getConnection();

			String query = "select test.name,test.cost from test inner join patient_test on test.t_id = patient_test.t_id where patient_test.date='"
					+ date + "' and patient_test.p_id=" + pId;

			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				report = new Report(rs.getString(1), rs.getInt(2));
				r.add(report);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return r;
	}

	public void insertPatientData(Patient p) {
		try {
			Utility obj = new Utility();
			Connection con = obj.getConnection();
			String query = " insert into patient(p_name,p_email,p_phone,p_dob)" + " values (?, ?, ?,?)";

			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setString(1, p.getName());
			preparedStmt.setString(2, p.getEmail());
			preparedStmt.setString(3, p.getPhone());
			preparedStmt.setString(4, p.getDob());
			preparedStmt.execute();

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
/*	public ArrayList<Report> fetchCost1(int pId, String date) {

          ArrayList<Report> list= new ArrayList<Report>();
          Report r=null;
		try {
		 Utility util= new Utility();
		 Connection con= util.getConnection();
		String query = "select test.name,test.cost from test inner join patient_test on test.t_id = patient_test.t_id where patient_test.date='"
				+ date + "' and patient_test.p_id=" + pId;
		
		Statement stmt=con.createStatement();
		ResultSet rs= stmt.executeQuery(query);
		while(rs.next()) {
		Report rep=new Report(rs.getString(1),rs.getInt(2));
	    list.add(rep);
		}
		
		}catch(Exception e) {
			System.out.println("Exception caught");
		}
	     return list; 
		
		
		
		}*/
		
		
		
		
		
		
		
		
		
		
		
		

		
	}
