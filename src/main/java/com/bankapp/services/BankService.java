package com.bankapp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.bankapp.model.Customer;




/**
 *
 * @author x17135486
 */
public class BankService {
    
    public static List<Customer> customerList = initCustomers();;
    private static Logger LOGGER = Logger.getLogger(BankService.class.getSimpleName());
    
    public List<Customer> getAllCustomers(){
    	LOGGER.info("entering getAllCustomers()...");        
        LOGGER.info("returning: " + customerList);
        return customerList;
    }
    
    private static List<Customer> initCustomers() {
    	customerList = new ArrayList<Customer>();
    	customerList.add(new Customer("The Hobbit", "Wesley Snipes", "The Book Co.", 0001));
    	customerList.add(new Customer("The Hobbit", "Wesley Snipes", "The Book Co.", 0001));
    	customerList.add(new Customer("The Hobbit", "Wesley Snipes", "The Book Co.", 0001));
    	customerList.add(new Customer("The Hobbit", "Wesley Snipes", "The Book Co.", 0001));
        return customerList;
	}

	public Customer getCustomer(int id){
    	LOGGER.info("entering getCustomer()...ith id: " + id);
    	try {
    		return customerList.get(id - 1);
		} catch (Exception e) {
			LOGGER.warning("** no customer found **");
			return null;
		}        
    }

	public Customer deleteCustomer(int id) {
		Customer deletedCustomer = customerList.get(id - 1);
		customerList.remove(id - 1);
		return deletedCustomer;
	}

	public static void addToCustomerList(Customer newCustomer) {
		//newCustomer.setId(customerList.size() + 1);   set id should be set when adding to DB
		customerList.add(newCustomer);
	}   
}
