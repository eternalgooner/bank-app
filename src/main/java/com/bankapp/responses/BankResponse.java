package com.bankapp.responses;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BankResponse {
	
	private String greeting = "Welcome to Bank APP, please login or create an account";

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
}
