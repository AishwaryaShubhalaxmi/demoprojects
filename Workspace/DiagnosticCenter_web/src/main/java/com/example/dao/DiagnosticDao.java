package com.example.dao;

import java.util.ArrayList;

import com.example.entity.Report;
import com.example.entity.Test;

public interface DiagnosticDao {

	Test fetchByTest(String tName);

	boolean putPatientTests(int pId, int tId);

	ArrayList<Report> fetchCost(int pId, String date);

}
