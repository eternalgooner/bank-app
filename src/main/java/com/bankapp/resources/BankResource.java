
package com.bankapp.resources;

import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bankapp.model.Customer;
import com.bankapp.responses.BankResponse;
import com.bankapp.responses.CustomerResponse;
import com.bankapp.services.BankService;

/**
 *
 * @author x17135486
 */
@Path("/bank/")
public class BankResource {
	
	private static Logger LOGGER = Logger.getLogger(BankResource.class.getSimpleName());
    private BankService bankService = new BankService();
    
    @GET
    @Path("home")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public BankResponse getGreeting(){
    	LOGGER.info("entering path webapi/rest/bank");
    	return new BankResponse();
    }
    
    @GET
    @Path("customers")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Customer> getCustomers() {
    	LOGGER.info("entering path webapi/bank/customers");
    	List<Customer> customerList = bankService.getAllCustomers();
		return customerList; 	
    }
    
  //login
    @POST
    @Path("login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public CustomerResponse login(Customer customer) {
    	LOGGER.info("login customer request received: " + customer);
    	bankService.login(customer);
        return new CustomerResponse("lgged in, " + customer.toString());
    }
}
