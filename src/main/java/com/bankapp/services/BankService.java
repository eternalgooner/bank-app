package com.bankapp.services;

import java.util.List;
import java.util.logging.Logger;

import com.bankapp.model.Customer;
import com.bankapp.repository.BankRepository;
import com.bankapp.responses.BankResponse;

/**
 *
 * @author x17135486
 */
public class BankService {
    
    private static Logger LOGGER = Logger.getLogger(BankService.class.getSimpleName());
    
    public List<Customer> getAllCustomers(){
    	LOGGER.info("entering getAllCustomers()...");
    	List<Customer> customerList = BankRepository.getAllCustomers();
        LOGGER.info("returning: " + customerList);
        return customerList;
    }    

	public Customer getCustomer(int id){
    	LOGGER.info("entering getCustomer()...ith id: " + id);
   		return BankRepository.getCustomerById(id - 1);
    }

	public boolean deleteCustomer(int id) {
		return BankRepository.deleteCustomer(id) ? true : false;
	}

	public boolean addToCustomerList(Customer newCustomer) {
		return BankRepository.addCustomer(newCustomer) ? true : false;
	}
}
