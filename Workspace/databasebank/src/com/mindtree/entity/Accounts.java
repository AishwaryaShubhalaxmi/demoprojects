package com.mindtree.entity;


public class Accounts {
	private long account_no;
	private float balance;
	private int customer_id;
   // private Customers customer_id;
	public long getAccount_no() {
		return account_no;
	}

	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public Accounts(long account_no, float balance, int customer_id) {
		super();
		this.account_no = account_no;
		this.balance = balance;
		this.customer_id = customer_id;
	}

	public Accounts() {
		// TODO Auto-generated constructor stub
	}

	public Accounts(long long1, float float1) {
		account_no=long1;
		balance=float1;
		// TODO Auto-generated constructor stub
	}


	
}
