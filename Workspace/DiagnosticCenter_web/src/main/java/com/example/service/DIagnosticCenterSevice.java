package com.example.service;

import com.example.entity.Report;

public interface DIagnosticCenterSevice {
	
	Report getReport(String email, String date);

}
