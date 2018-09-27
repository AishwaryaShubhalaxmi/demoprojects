package com.example.dto;

import java.util.ArrayList;

import com.example.entity.Patient;
import com.example.entity.Report;

public class PatientDto 
{
	Patient p;
	ArrayList<Report> r;
	String date;
	public PatientDto(Patient p, ArrayList<Report> r, String date) {
		super();
		this.p = p;
		this.r = r;
		this.date = date;
	}
	public Patient getP() {
		return p;
	}
	public void setP(Patient p) {
		this.p = p;
	}
	public ArrayList<Report> getR() {
		return r;
	}
	public void setR(ArrayList<Report> r) {
		this.r = r;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
