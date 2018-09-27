package com.mindtree.client;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.mindtree.dao.Implementationdao;
import com.mindtree.entity.Accounts;
import com.mindtree.entity.Transactions;
import com.mindtree.util.Utility;
public class Mainclass {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      Utility ob= new Utility();
      Implementationdao object= new Implementationdao();
      Accounts acc= new Accounts();
      Transactions trans= new Transactions();
      System.out.println("Enter username:");
      String user= sc.next();
      acc= object.fetchaccountDetails(user);
      System.out.println(acc.getAccount_no() + " " + acc.getBalance());
      
      System.out.println("Enter transaction date");
      String date=sc.next();
      Date date1= new SimpleDateFormat("dd/MM/yyyy").parse(date);
      
	}

}
