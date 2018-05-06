package com.bankapp.model;

import java.util.Date;

public class Transaction {
	
	private TransactionType type;
	private Date date;
	private String description;
	private double amount;
	private Account accountTo;
	private Account accountFrom;

	public Transaction() {}
	
	public Transaction(TransactionType type, Date date, String description, double amount, Account accountTo, Account accountFrom) {
		this.type = type;
		this.date = date;
		this.description = description;
		this.amount = amount;
		this.accountTo = accountTo;
		this.accountFrom = accountFrom;
	}
	
	public boolean process() {
		
		switch (type) {
		case DEBIT:
			return debitAccount();
		case CREDIT:
			return creditAccount();
		default:
			return false;
		}
	}



	private boolean transferFunds() {
		//if account from has the funds then proceed with transfer
		if(accountFrom.makeWithdrawal(amount)) {
			accountTo.makeLodgement(amount);
			return true;
		}
		return false;
	}

	private boolean creditAccount() {
		return accountTo.makeLodgement(amount);
	}

	private boolean debitAccount() {
		return accountFrom.makeWithdrawal(amount);
	}

	public TransactionType getType() {
		return type;
	}



	public Date getDate() {
		return date;
	}



	public String getDescription() {
		return description;
	}



	public double getAmount() {
		return amount;
	}



	public Account getAccountTo() {
		return accountTo;
	}



	public Account getAccountFrom() {
		return accountFrom;
	}



	public enum TransactionType{
		DEBIT,
		CREDIT
	}

}
