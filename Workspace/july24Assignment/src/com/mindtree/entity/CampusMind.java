package com.mindtree.entity;

import java.util.*;

class CampusMind implements Comparable<CampusMind> {
	private String name;
	private String mID;
	private Date doj;
	private int orhardScore;

	public CampusMind(String name, String mID, Date doj, int orhardScore) {
		super();
		this.name = name;
		this.mID = mID;
		this.doj = doj;
		this.orhardScore = orhardScore;
	}

	public int compareTo(CampusMind mind) {
		int result = 0;
		
		result = this.mID.compareToIgnoreCase(mind.getmID());
		return result;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getmID() {
		return mID;
	}

	public void setmID(String mID) {
		this.mID = mID;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public int getOrhardScore() {
		return orhardScore;
	}

	public void setOrhardScore(int orhardScore) {
		this.orhardScore = orhardScore;
	}

}
