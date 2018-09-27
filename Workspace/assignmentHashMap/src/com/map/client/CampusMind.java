package com.map.client;

import java.util.Date;

public class CampusMind {
 private String name;
 private String track;
 private Date doj;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTrack() {
	return track;
}
public void setTrack(String track) {
	this.track = track;
}
public Date getDoj() {
	return doj;
}
public void setDoj(Date doj) {
	this.doj = doj;
}
public CampusMind(String name, String track, Date doj) {
	super();
	this.name = name;
	this.track = track;
	this.doj = doj;
	
}
public CampusMind() {
	// TODO Auto-generated constructor stub
}
}
