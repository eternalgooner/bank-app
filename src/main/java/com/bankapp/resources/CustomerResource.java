
package com.bankapp.resources;

import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bankapp.model.Customer;
import com.bankapp.services.BankService;

/**
 *
 * @author x17135486
 */
@Path("/rest/")
public class CustomerResource {
	
	private static Logger LOGGER = Logger.getLogger(CustomerResource.class.getSimpleName());
    private BankService bankService = new BankService();
    private static final int _404_ERROR_CODE = 404;
	private static final String CUSTOMER_CREATED = "customer created successfully";
    
    @GET
    @Path("customers")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Customer> getAllCustomers(){        					//need to add Type in List as this uses @XmlRootElement
    	LOGGER.info("entering path webapi/rest/customers");
    	List<Customer> customers = bankService.getAllCustomers();
    	return customers;
    }
    
    @GET
    @Path("customer/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Customer getCustomer(@PathParam("id") int id) {
    	LOGGER.info("entering path webapi/rest/book/" + id);
    	Customer customer = bankService.getCustomer(id);
    	if (customer != null) {
    		LOGGER.info("book found, returning book");
            return customer;
		}else {
			LOGGER.info("no customer found, return error message");
			//return bookResponse; flesh this out
			return null;
		}    	
    }
    
   /*
    * need to refactor these 2 methods for the bank
    *  
    *  @POST
    @Path("customer/create")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public CreateCustomerResponse createBook(Customer newCustomer) {
    	LOGGER.info("create customer request received: " + newCustomer);
    	BankService.addToCustomerList(newCustomer);
    	int newBookId = bankService.getAllCustomers().size();
        return new CreateBookResponse(BOOK_CREATED, + newBookId);
    }
   
    @GET
    @Path("book/delete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public DeleteBookResponse deleteBook(@PathParam("id") int id) {
    	LOGGER.info("request received to delete book with id: " + id);
    	Book deletedBook = bookService.deleteBook(id);
        return new DeleteBookResponse(deletedBook, true);
    }*/
}
