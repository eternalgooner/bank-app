package com.bankapp.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.bankapp.model.Account;
import com.bankapp.model.Customer;
import com.bankapp.model.Transaction;

public class BankRepository {
	
	public static List<Customer> customerList;
	
	static{
		if (customerList == null) {
			customerList = new ArrayList<Customer>();
		}
		customerList.add(new Customer("tom", "1 main st, dublin", "abc@nnn.bnb", 1121));
		customerList.add(new Customer("jack", "34 tree drive, cork", "hjk@lkj.lkj", 1234));
		customerList.add(new Customer("jerry", "heaven, galway", "mail@mail.com", 5456));
		customerList.add(new Customer("george", "old house, donegal", "test@test.ie", 8876));
	}

	public static List<Customer> getAllCustomers() {
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

	public static boolean updateAddress(Customer updatedCustomer) {
		// TODO Auto-generated method stub
		List<Customer> customerToUpdate = customerList.stream()
				.filter(customer -> customer.getEmail().equalsIgnoreCase(updatedCustomer.getEmail()))
				.collect(Collectors.toList());
		customerToUpdate.get(0).setAddress(updatedCustomer.getAddress());
		return true;
	}

	public static Customer addAccount(Account newAccount) {
		Customer customer = customerList.get(0);
		customer.getAccountList().add(newAccount);
		return customer;
	}

	public static Account getAccount(int id) {
		Customer customer = customerList.get(0);
		return customer.getAccountList().get(id);
	}

	public static Customer deleteAccount(Account account) {
		Customer customer = customerList.get(0);
		customer.getAccountList().remove(0);
		return customer;
	}

	public static Account getAccount(String type) {
		Customer customer = customerList.get(0);
		return customer.getAccountList().get(0);
	}

	public static double getBalance(String type) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static List<Transaction> getTransactions(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Account withdrawFunds(Transaction transaction) {
		Customer customer = customerList.get(0);
		Account account = customer.getAccountList().get(0);
		transaction.process();
		account.makeWithdrawal(transaction.getAmount());
		return account;
	}

	public static Account lodgeFunds(Transaction transaction) {
		// TODO Auto-generated method stub
		return null;
	}
}
