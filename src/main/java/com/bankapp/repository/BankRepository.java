package com.bankapp.repository;

import java.util.ArrayList;
import java.util.List;

import com.bankapp.model.Customer;

public class BankRepository {
	
	public static List<Customer> customerList = getAllCustomers();

	public static List<Customer> getAllCustomers() {
    	customerList = new ArrayList<Customer>();
    	customerList.add(new Customer("tom", "1 main st, dublin", "abc@nnn.bnb", 1121));
    	customerList.add(new Customer("jack", "34 tree drive, cork", "hjk@lkj.lkj", 1234));
    	customerList.add(new Customer("jerry", "heaven, galway", "mail@mail.com", 5456));
    	customerList.add(new Customer("george", "old house, donegal", "test@test.ie", 8876));
        return customerList;
	}

	public static Customer getCustomerById(int i) {
		// TODO Auto-generated method stub
		//replace with DB operation
		return customerList.get(i - 1);
	}

	public static boolean deleteCustomer(int id) {
		// TODO Auto-generated method stub
		//replace with DB operation
		customerList.remove(id - 1);
		return true;
	}

	public static boolean addCustomer(Customer newCustomer) {
		// TODO Auto-generated method stub
		customerList.add(newCustomer);
		return true;
	}

	public static boolean updateCustomer(Customer updatedCustomer) {
		// TODO Auto-generated method stub
		return false;
	}
}
