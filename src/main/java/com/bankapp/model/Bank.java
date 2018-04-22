package com.bankapp.model;

import java.util.List;

public class Bank {

	private List<Customer> customerList;
	private boolean customerLoggedIn;
	
	public Bank(List<Customer> customerList) {
		this.customerList = customerList;
	}
	
	public boolean addCustomer(Customer customer) {
		try {
			//try to add to DB here - may throw DB exception
			customerList.add(customer);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}	
	}
	
	public boolean deleteCustomer(Customer customer) {
		try {
			//try to delete from DB here - may throw DB exception
			customerList.remove(customer);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}	
	}
	
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
