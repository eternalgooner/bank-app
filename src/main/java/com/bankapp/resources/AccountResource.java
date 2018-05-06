package com.bankapp.resources;

import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bankapp.model.Account;
import com.bankapp.model.Customer;
import com.bankapp.model.Transaction;
import com.bankapp.responses.AccountResponse;
import com.bankapp.responses.TransactionResponse;
import com.bankapp.services.AccountService;

@Path("/customer/account/")
public class AccountResource {
	
	private static Logger LOGGER = Logger.getLogger(AccountResource.class.getSimpleName());
	private AccountService accountService = new AccountService();
    
	//create
	@POST
    @Path("create")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Customer createAccount(Account newAccount){
    	LOGGER.info("entering path webapi/customer/account/create with request\n" + newAccount.toString());
    	return accountService.addAccount(newAccount);    	
    	//return new AccountResponse();
    }
    
    	
	//delete/{id}
    @GET
    @Path("delete/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Customer deleteAccount(@PathParam("id") int id) {
    	LOGGER.info("entering path webapi/customer/account/delete{id}/" + id);
    	Account account = accountService.getAccount(id);
    	if (account != null) {
    		LOGGER.info("account found, deleting...");
    		return AccountService.deleteAccount(account);
		}else {
			LOGGER.info("no account found, return error message");
			return null;
		}    	
    }	
	
	
	//{type} - savings or current
    @GET
    @Path("{type}")
    @Produces(MediaType.APPLICATION_JSON)
    public Account getAccountType(@PathParam("type") String type) {
    	LOGGER.info("request received to get account type: " + type);
    	return accountService.getAccount(type);
	}       
    
	
	//transaction/withdraw
    @POST
    @Path("transaction/withdraw")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public TransactionResponse withdraw(Transaction transaction) {
    	LOGGER.info("withdraw request received");
    	accountService.withdrawFunds(transaction);
        return new TransactionResponse();
    }
	
	
	//transaction/lodge
    @POST
    @Path("transaction/lodge")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public TransactionResponse lodge(Transaction transaction) {
    	LOGGER.info("lodge request received");
    	accountService.lodgeFunds(transaction);
        return new TransactionResponse();
    }
	
	
	//balance/{id}
    @POST
    @Path("balance/{type}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public AccountResponse getBalance(@PathParam("id") String type) {
    	LOGGER.info("account balance request received: " + type);
    	accountService.getBalance(type);
        return new AccountResponse();
    }

    
	//transactions/
    @POST
    @Path("transactions")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Transaction> getTransactions(Customer customer) {
    	LOGGER.info("view transactions request received");
        return accountService.getTransactions(customer);
    }
	
	//transfer
    @POST
    @Path("transfer")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public TransactionResponse transferFunds(Transaction transaction) {
    	LOGGER.info("transfer request received: " + transaction);
    	accountService.transferFunds(transaction);
        return new TransactionResponse();
    }
    
    //logout
    @POST
    @Path("logout")
    @Produces(MediaType.APPLICATION_JSON)
    public AccountResponse logout(Customer customer) {
    	LOGGER.info("logout request received: " + customer);
    	accountService.logout(customer);
        return new AccountResponse();
    }
}
