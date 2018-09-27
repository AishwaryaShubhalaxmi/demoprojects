package com.jdbc.service;

import java.util.ArrayList;

import com.jdbc.dao.DaoImpl;
import com.jdbc.entity.Employee;
import com.jdbc.exception.Daoexception;

public class ServiceImpl {
	DaoImpl dao= new DaoImpl();
	public void insertion(int id, String name, double salary) throws Daoexception {
      dao.insertData(id, name, salary);		
	}
	
	/*public boolean insertion1(ArrayList<Employee> employee) {
		dao.insertData1(employee);
		return true;
	}
*/	
	public void selection() {
		dao.selectData();
	}

}
