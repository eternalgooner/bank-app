package com.bankapp.services;

import java.util.List;

import com.bankapp.model.Account;
import com.bankapp.model.Customer;
import com.bankapp.model.Transaction;
import com.bankapp.repository.BankRepository;

public class AccountService {
	
	public Customer addAccount(Account newAccount) {
		return BankRepository.addAccount(newAccount);
	}

	public Account getAccount(int id) {
		return BankRepository.getAccount(id);
	}

	public static Customer deleteAccount(Account account) {
		return BankRepository.deleteAccount(account);
	}

	public Account getAccount(String type) {
		return BankRepository.getAccount(type);
	}

	public Account withdrawFunds(Transaction transaction) {
		return BankRepository.withdrawFunds(transaction);
	}

	public Account lodgeFunds(Transaction transaction) {
		return BankRepository.lodgeFunds(transaction);
	}

	public Account getBalance(String type) {
		return BankRepository.getBalance(type);
	}

	public List<Transaction> getTransactions(Customer customer) {
		return BankRepository.getTransactions(customer);
	}

	public void transferFunds(Transaction transaction) {
		
	}

	public void logout(Customer customer) {
		
	}

}
