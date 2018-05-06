package com.bankapp.model;

import java.time.LocalDate;

public class Transaction {
	
	private String type;
	private LocalDate date;
	private String description;
	private double amount;
	private Account accountTo;
	private Account accountFrom;

	public Transaction() {}
	
	public Transaction(String type, LocalDate date, String description, double amount, Account accountFrom) {
		this.type = type;
		this.date = date;
		this.description = description;
		this.amount = amount;
		this.accountTo = null;;
		this.accountFrom = accountFrom;
	}
	
	public Transaction(String type, LocalDate date, String description, double amount, Account accountTo, Account accountFrom) {
		this.type = type;
		this.date = date;
		this.description = description;
		this.amount = amount;
		this.accountTo = accountTo;
		this.accountFrom = accountFrom;
	}
	
	
	public boolean process() {
		
		switch (type) {
		case "debit":
			return debitAccount();
		case "credit":
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

	public String getType() {
		return type;
	}

	public LocalDate getDate() {
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
	
	

	public void setType(String type) {
		this.type = type;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setAccountTo(Account accountTo) {
		this.accountTo = accountTo;
	}

	public void setAccountFrom(Account accountFrom) {
		this.accountFrom = accountFrom;
	}

	@Override
	public String toString() {
		return "Transaction [date=" + date + ", description=" + description + ", amount=" + amount + ", accountTo="
				+ accountTo + ", accountFrom=" + accountFrom + "]";
	}
}
