package com.example.service;

import java.util.ArrayList;

import com.example.dao.DiagnosticDaoImplementations;
import com.example.entity.Patient;
import com.example.entity.Report;
import com.example.entity.Test;

public class DIagnosticServiceImpl implements DIagnosticCenterSevice {
	DiagnosticDaoImplementations obj;

	public DIagnosticServiceImpl() {
		super();
		obj = new DiagnosticDaoImplementations();
	}

	@Override
	public Report getReport(String email, String date) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * public void addTests(Patient p) { ArrayList<Test> arr=new ArrayList<Test>();
	 * Test t; DiagnosticDaoImplementations obj=new DiagnosticDaoImplementations();
	 * String exit="YES"; while(exit.equalsIgnoreCase("YES")) {
	 * t=obj.fetchByTest(DiagnosticCenterMain.enterTestName()); arr.add(t);
	 * exit=DiagnosticCenterMain.status(); } for(int i=0;i<arr.size();i++) { Test
	 * temp=arr.get(i); //System.out.println(temp.gettId()+"  "+p.getpId());
	 * obj.putPatientTests(p.getpId(),temp.gettId()); }
	 * DiagnosticCenterMain.successMessage();
	 */

	public Patient updateData(Patient p) {
		DiagnosticDaoImplementations dao = new DiagnosticDaoImplementations();

		dao.insertPatientData(p);
		return p;
	}

	public boolean addTestsEmail(String email, String testName) {
		try {
			DiagnosticDaoImplementations obj = new DiagnosticDaoImplementations();
			Patient p = obj.fetchByEmail(email);
			System.out.println(p.getDob());
			Test t = obj.fetchByTest(testName);
			System.out.println("In service line 49 " + t.getCost());
			boolean inserted = obj.putPatientTests(p.getpId(), t.gettId());
			return inserted;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean addTestsPhone(String phone, String testName) {
		try {
		DiagnosticDaoImplementations obj = new DiagnosticDaoImplementations();
		Patient p = obj.fetchByPhone(phone);
		Test t = obj.fetchByTest(testName);
		 boolean inserted=obj.putPatientTests(p.getpId(), t.gettId());
		 return inserted;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void generateReportByEmail(String email, String date) {

	}
}
