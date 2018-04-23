package com.bankapp.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String name;
	private String address;
	private String email;
	private int pin;
	private List<Account> accountList;
	
	public Customer(String name, String address, String email, int pin) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.pin = pin;
		this.accountList = new ArrayList<>();
	}
	
	public boolean createAccount(String accountType) {
		try {
			//try & create new account & add to DB
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean deleteAccount(int accountId) {
		try {
			//try & delete account from DB
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getPin() {
		return pin;
	}
	
	public void setPin(int pin) {
		this.pin = pin;
	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}	
}
