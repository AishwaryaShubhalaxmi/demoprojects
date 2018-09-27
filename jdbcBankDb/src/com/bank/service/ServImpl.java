package com.bank.service;

import java.util.ArrayList;

import com.bank.dao.DaoImpl;
import com.bank.entity.Transactions;

public class ServImpl {
	DaoImpl dao= new DaoImpl();
	public void insertion1(int customer_id,String f_name, String l_name,String username,String password) {
		dao.insertCustomers(customer_id, f_name, l_name, username, password);
	}
	
    public void insertion2(int account_no,double balance, int customer_id) {
    	dao.insertAccounts(account_no, balance, customer_id);
    	
    }
    public void fetchbalance(String first_name) {
    	dao.fetchBalance(first_name);
    }
    
    public ArrayList<Transactions> getTranDetails(String date_of_transfer){
    	ArrayList<Transactions> arr= new ArrayList<Transactions>();
    	arr=dao.getDetails(date_of_transfer);
    	return arr;
    }
}
