package com.bankapp.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	
	private int sortCode;
	private int accountNumber;
	private double currentBalance;
	private String accountType;					//should be savings or current
	private List<Transaction> transactionList;
	
	public Account() {}
	
	public Account(int sortCode, int accountNumber, double currentBalance, String accountType) {
		this.sortCode = sortCode;
		this.accountNumber = accountNumber;
		this.currentBalance = currentBalance;
		this.accountType = accountType;
		this.transactionList = new ArrayList<>();
	}
	
	public boolean makeLodgement(double amount) {
		currentBalance += amount;
		return true;
	}
	
	
	public boolean makeWithdrawal(double amount) {
		if((currentBalance - amount) < 0) {
			return false;
		}else {
			currentBalance -= amount;
			return true;
		}
	}	

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
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

	public List<Transaction> getTransactionList() {
		return transactionList;
	}
	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}
	
	@Override
	public String toString() {
		return "Account [sortCode=" + sortCode + ", accountNumber=" + accountNumber + ", currentBalance="
				+ currentBalance + ", accountType=" + accountType + "]";
	}
}
