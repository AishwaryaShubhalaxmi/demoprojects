package com.mindtree.entity;
import java.util.Date;

public class Transactions {
	private long b_account_no;
	  private Double amount;
	  private Date transaction_date;
	  private String transaction_detail; 
	  private long account_no;
	  
  public long getAccount_no() {
	return account_no;
}
public void setAccount_no(long account_no) {
	this.account_no = account_no;
}
public long getB_account_no() {
	return b_account_no;
}
public void setB_account_no(long b_account_no) {
	this.b_account_no = b_account_no;
}
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}
public Date getTransaction_date() {
	return transaction_date;
}
public void setTransaction_date(Date transaction_date) {
	this.transaction_date = transaction_date;
}
public String getTransaction_detail() {
	return transaction_detail;
}
public void setTransaction_detail(String transaction_detail) {
	this.transaction_detail = transaction_detail;
}
public Transactions(long account_no, long b_account_no, Double amount, Date transaction_date,
		String transaction_detail) {
	super();
	this.account_no = account_no;
	this.b_account_no = b_account_no;
	this.amount = amount;
	this.transaction_date = transaction_date;
	this.transaction_detail = transaction_detail;
}
public Transactions() {
	// TODO Auto-generated constructor stub
}
  
}
