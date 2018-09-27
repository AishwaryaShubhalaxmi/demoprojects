package com.jdbc.entity;

public class Player {
private int playerId;

public int getPlayerId() {
	return playerId;
}
public void setPlayerId(int playerId) {
	this.playerId = playerId;
}
public int getCountryId() {
	return countryId;
}
public void setCountryId(int countryId) {
	this.countryId = countryId;
}
public String getPlayerName() {
	return playerName;
}
public void setPlayerName(String playerName) {
	this.playerName = playerName;
}
public int getRunsMade() {
	return runsMade;
}
public void setRunsMade(int runsMade) {
	this.runsMade = runsMade;
}
public int getWicketsTaken() {
	return wicketsTaken;
}
public void setWicketsTaken(int wicketsTaken) {
	this.wicketsTaken = wicketsTaken;
}
public Player(int playerId, int countryId, String playerName, int runsMade, int wicketsTaken) {
	super();
	this.playerId = playerId;
	this.countryId = countryId;
	this.playerName = playerName;
	this.runsMade = runsMade;
	this.wicketsTaken = wicketsTaken;
}
public Player(String string) {
	// TODO Auto-generated constructor stub
}
private int countryId;
private String playerName;
private int runsMade;
private int wicketsTaken;
}
