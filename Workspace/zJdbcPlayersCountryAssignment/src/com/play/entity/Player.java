package com.play.entity;

public class Player {
private int player_id;
private int country_id;
private String player_name;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + country_id;
	result = prime * result + player_id;
	result = prime * result + ((player_name == null) ? 0 : player_name.hashCode());
	result = prime * result + runs_made;
	result = prime * result + wickets_taken;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Player other = (Player) obj;
	if (country_id != other.country_id)
		return false;
	if (player_id != other.player_id)
		return false;
	if (player_name == null) {
		if (other.player_name != null)
			return false;
	} else if (!player_name.equals(other.player_name))
		return false;
	if (runs_made != other.runs_made)
		return false;
	if (wickets_taken != other.wickets_taken)
		return false;
	return true;
}
private int runs_made;
private int wickets_taken;
public int getPlayer_id() {
	return player_id;
}
public void setPlayer_id(int player_id) {
	this.player_id = player_id;
}
public int getCountry_id() {
	return country_id;
}
public void setCountry_id(int country_id) {
	this.country_id = country_id;
}
public String getPlayer_name() {
	return player_name;
}
public void setPlayer_name(String player_name) {
	this.player_name = player_name;
}
public int getRuns_made() {
	return runs_made;
}
public void setRuns_made(int runs_made) {
	this.runs_made = runs_made;
}
public int getWickets_taken() {
	return wickets_taken;
}
public void setWickets_taken(int wickets_taken) {
	this.wickets_taken = wickets_taken;
}
public Player(int player_id, int country_id, String player_name, int runs_made, int wickets_taken) {
	super();
	this.player_id = player_id;
	this.country_id = country_id;
	this.player_name = player_name;
	this.runs_made = runs_made;
	this.wickets_taken = wickets_taken;
}
public Player(String player_name) {
	// TODO Auto-generated constructor stub
	this.player_name=player_name;
}

}
