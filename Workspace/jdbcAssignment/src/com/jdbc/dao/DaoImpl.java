package com.jdbc.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.jdbc.entity.Player;
import com.jdbc.util.Utility;

public class DaoImpl {
	
	Utility util= new Utility();
	Connection con=util.getConnection();
public void insertData(int countryId, String countryName) {
	try {
		CallableStatement stmt= con.prepareCall("{call insertData(?,?)}");
		stmt.setInt(1, countryId);
		stmt.setString(2,countryName);
		stmt.execute();
	} catch (SQLException e) {
	System.out.println(e);

	}
}
public void insertDataPlayer(int playerId,int countryId, String playerName, int runsMade, int wicketsTaken ) {
	String query = " insert into players(playerid,countryId,playerName,runMade,wicketsTaken)" + " values (?,?,?,?,?)";
	try {
		PreparedStatement ps= con.prepareStatement(query);
		ps.setInt(1, playerId);
		ps.setInt(2, countryId);
		ps.setString(3, playerName);
		ps.setInt(4, runsMade);
		ps.setInt(5, wicketsTaken);
		ps.execute();
	} catch (SQLException e) {
		System.out.println(e);
		
	}
	
}
public ArrayList<Player> selectData() {
	ArrayList<Player> arr= new ArrayList<Player>();
	Player play=null;
	String query="select playerName from players where runMade >= 100 AND wicketstaken >=15";
	Statement st;
	try {
		st = con.createStatement();
		ResultSet rs= st.executeQuery(query);
		while(rs.next()) {
		 play=new Player( rs.getString(1));
		 arr.add(play);
		}
	} catch (SQLException e) {
	
		System.out.println(e);
	}
	return arr;
}
}
 