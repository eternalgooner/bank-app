
package com.bankapp.resources;

import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bankapp.model.Customer;
import com.bankapp.responses.CustomerResponse;
import com.bankapp.services.CustomerService;

/**
 *
 * @author x17135486
 */
@Path("/customer/")
public class CustomerResource {
	
	private static Logger LOGGER = Logger.getLogger(CustomerResource.class.getSimpleName());
	private CustomerService customerService = new CustomerService();
    
	@POST
    @Path("create")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public CustomerResponse createCustomer(Customer newCustomer){
    	LOGGER.info("entering path webapi/customer/create");
    	customerService.addCustomer(newCustomer);    	
    	return new CustomerResponse();
    }
    
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Customer getCustomer(@PathParam("id") int id) {
    	LOGGER.info("entering path webapi/customer/{id}/" + id);
    	Customer customer = customerService.getCustomer(id);
    	if (customer != null) {
    		LOGGER.info("customer found, returning...");
            return customer;
		}else {
			LOGGER.info("no customer found, return error message");
			//return CustomerResponse; flesh this out
			return null;
		}    	
    }
    
   
    @POST
    @Path("update")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public CustomerResponse updateCustomer(Customer updatedCustomer) {
    	LOGGER.info("update customer request received: " + updatedCustomer);
    	customerService.updateCustomer(updatedCustomer);
        return new CustomerResponse("updated profile, " + updatedCustomer.toString());
    }
   
    @GET
    @Path("delete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public CustomerResponse deleteCustomer(@PathParam("id") int id) {
    	LOGGER.info("request received to delete customer with id: " + id);
    	boolean customerIsDeleted = customerService.deleteCustomer(id);    	
    	if (customerIsDeleted) {
    		return new CustomerResponse("customer deleted with id " + id);
		}else {
			 //TODO return bad response
	    	return new CustomerResponse("failed");
		}       
    }
}
