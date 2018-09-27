package com.bank.entity;

public class Accounts {
	private int account_no;
	private double balance;
	private int customer_id;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public void setAccount(int account_no) {
		this.account_no=account_no;
	}
	public int getAccount() {
		return account_no;
	}

}
