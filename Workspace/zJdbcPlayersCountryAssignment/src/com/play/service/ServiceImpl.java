package com.play.service;

import com.play.dao.daoImpl;

public class ServiceImpl {
  public void insertion(int player_id,int country_id, String player_name, int runs_made,int wickets_taken) {
	  daoImpl dao= new daoImpl();
	  dao.insertData(player_id, country_id, player_name, runs_made, wickets_taken);
  }
  
    public void selection() {
	  daoImpl dao=new daoImpl();
	   dao.selectData();

  }
}
