package com.play.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.play.entity.Player;
import com.play.utility.util;

public class daoImpl {
   
	public void insertData(int player_id,int country_id, String player_name, int runs_made,int wickets_taken) {
		  util ut= new util();
		  Connection con=ut.getConnection();
		 String query="insert into players(player_id,country_id,player_name,runs_made,wickets_taken)" + "values(?,?,?,?,?)";
		 try {
			PreparedStatement stmt= con.prepareStatement(query);
			stmt.setInt(1,player_id);
			stmt.setInt(2, country_id);
			stmt.setString(3,player_name );
			stmt.setInt(4, runs_made);
			stmt.setInt(5, wickets_taken);
			stmt.execute();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	   public Player selectData() {
		util ut=new util();
		Connection con=ut.getConnection();
		ArrayList<Player> arr= new ArrayList<Player>();
		Player p=null;
		String query="select player_name from players where runs_made>=100 AND wickets_taken>=15";
		try {
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery(query);
			while(rs.next()) {
			 p=new Player(rs.getString(1)); 
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}return p;
	}
	
	}


