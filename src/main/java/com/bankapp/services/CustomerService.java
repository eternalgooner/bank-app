package com.bankapp.services;

import com.bankapp.model.Customer;
import com.bankapp.repository.BankRepository;

public class CustomerService {

	public Customer getCustomer(int id) {
		return BankRepository.getCustomerById(id);
	}

	public boolean updateCustomer(Customer updatedCustomer) {
		return BankRepository.updateCustomer(updatedCustomer) ? true : false;
	}

	public boolean addCustomer(Customer newCustomer) {
		return BankRepository.addCustomer(newCustomer) ? true : false;
	}
	
	public boolean deleteCustomer(int id) {
		return BankRepository.deleteCustomer(id) ? true : false;
	}

}
