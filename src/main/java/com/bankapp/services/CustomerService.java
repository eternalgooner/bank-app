package com.bankapp.services;

import com.bankapp.model.Customer;
import com.bankapp.repository.BankRepository;

public class CustomerService {

	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateCustomer(Customer updatedCustomer) {
		// TODO Auto-generated method stub
		return BankRepository.updateCustomer(updatedCustomer) ? true : false;
	}

	public boolean addCustomer(Customer newCustomer) {
		// TODO Auto-generated method stub
		return BankRepository.addCustomer(newCustomer) ? true : false;
	}
	
	public boolean deleteCustomer(int id) {
		return BankRepository.deleteCustomer(id) ? true : false;
	}

}
