package com.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.jdbc.entity.Employee;
import com.jdbc.exception.Daoexception;
import com.jdbc.utility.Utility;

public class DaoImpl {
	 Utility util= new Utility();
	 Connection con;
	public void insertData(int id,String name,double salary) throws Daoexception{
		con=util.openConnection();
		String query="insert into employee values(?,?,?)";
		try {
			PreparedStatement stmt=con.prepareStatement(query);
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setDouble(3,salary);
			stmt.execute();
		} catch (SQLException e) {
		
			throw new Daoexception("exception");
		}
		
	}
	public boolean insertData1(ArrayList<Employee> arr){
		try {
			con=util.openConnection();
			Statement stm=con.createStatement();
			String query1="";
			//PreparedStatement ps= null;
			for(Employee e1: arr) {
				/*query1="insert into employee values(?,?,?)";
				ps=con.prepareStatement(query1);
				ps.setInt(1,e1.getId());
				ps.setString(2,e1.getName());
				ps.setDouble(3,e1.getSalary());
				ps.execute();*/
				
				int id=e1.getId();
				String name=e1.getName();
				double salary=e1.getSalary();
			    query1="insert into employee values("+id+","+"'"+name+"'"+","+salary+")";
			    System.out.println(query1+" Name: "+name);
			    stm.executeUpdate(query1);
				
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return true;
		
		
	}
	 public void selectData() {
		con=util.openConnection();
		String query="select * from employee";
		
		try {
			Statement st= con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<Employee> selectData1(){
		ArrayList<Employee> arr= new ArrayList<Employee>();
		Employee e1= null;
		con=util.openConnection();
		String query2="select * from employee";
		try {
			Statement st= con.createStatement();
			ResultSet rs=st.executeQuery(query2);
			while(rs.next()) {
			e1= new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3));	
			arr.add(e1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arr;
	}
	

}
