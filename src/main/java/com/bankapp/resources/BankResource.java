
package com.bankapp.resources;

import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bankapp.model.Customer;
import com.bankapp.responses.BankResponse;
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
    	BankResponse response = bankService.getGreeting();
    	return response;
    }
    
    @GET
    @Path("customers")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Customer> getCustomers() {
    	LOGGER.info("entering path webapi/bank/customers");
    	List<Customer> customerList = bankService.getAllCustomers();
			return customerList; 	
    }
}
