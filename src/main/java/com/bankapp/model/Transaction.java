package com.bankapp.model;

import java.util.List;

public class Transaction {
	
	private List<Customer> customerList;
	private boolean customerLoggedIn;
	
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	public boolean isCustomerLoggedIn() {
		return customerLoggedIn;
	}
	public void setCustomerLoggedIn(boolean customerLoggedIn) {
		this.customerLoggedIn = customerLoggedIn;
	}
	
	

}
