package com.sdet.entity;

public class Accounts {
 
	private Long account_no;
	private Double balance;
	public Long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(Long account_no) {
		this.account_no = account_no;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public Accounts(Long account_no, Double balance, int customer_id) {
		super();
		this.account_no = account_no;
		this.balance = balance;
		this.customer_id = customer_id;
	}
	private int customer_id;
}
