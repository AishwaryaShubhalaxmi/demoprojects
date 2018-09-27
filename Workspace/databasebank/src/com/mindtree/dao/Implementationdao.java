package com.mindtree.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mindtree.entity.Accounts;
import com.mindtree.entity.Transactions;
import com.mindtree.util.Utility;

public class Implementationdao {

	public Accounts fetchaccountDetails(String user) {
		// TODO Auto-generated method stub
		Accounts value=null;
		try {
			Utility ob= new Utility();
			Connection con= ob.getConnection();
			
			String res="select accounts.account_no,accounts.balance from accounts inner join customers on accounts.customers_id= customers.id where username='"+user+"'";
			Statement stmt= con.createStatement();
			ResultSet rs= stmt.executeQuery(res);
			while(rs.next()) {
				value=new Accounts(rs.getLong(1),rs.getFloat(2));
		
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return value;

	}

     public Transactions fetchTransactionDetails(ArrayList<Transactions> tr1) {
    	 
    	List<Transactions> tr= new ArrayList<Transactions>();
    	
    	 try {
    		 Utility ob= new Utility();
 			Connection con= ob.getConnection();
 			Statement stmt =con.createStatement();
 			 ResultSet rs1= stmt.executeQuery("select transactions.account_no, transactions.beneficiary_ac_no,transactions.transaction_amount, transactions.transaction_detail from transactions inner join accounts on accounts.account_no=transactions.account_no where transaction_date='date1'");
    	    
    	    
    	    while(rs1.next()) {
    	    	tr.add(rs1.getInt(1));
    	    }
    	 
    	 }
     }
}
