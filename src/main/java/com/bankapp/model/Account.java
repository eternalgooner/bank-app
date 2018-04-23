package com.bankapp.model;

import java.util.List;

public class Account {
	
	private int sortCode;
	private int accountNumber;
	private double currentBalance;
	private AccountType accountType;
	private List<Transaction> transactionList;
	
	
	public Account(int sortCode, int accountNumber, double currentBalance, AccountType accountType) {
		this.sortCode = sortCode;
		this.accountNumber = accountNumber;
		this.currentBalance = currentBalance;
		this.accountType = accountType;
	}
	
	public int getSortCode() {
		return sortCode;
	}
	public void setSortCode(int sortCode) {
		this.sortCode = sortCode;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	public AccountType getType() {
		return accountType;
	}
	public void setType(AccountType accountType) {
		this.accountType = accountType;
	}
	public List<Transaction> getTransactionList() {
		return transactionList;
	}
	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}
	
	private enum AccountType{
		CURRENT,
		SAVINGS
	}
	

}
