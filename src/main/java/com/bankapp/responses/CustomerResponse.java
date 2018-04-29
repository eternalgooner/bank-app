package com.bankapp.responses;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerResponse {

	private boolean successful = true;	
	private String message;
	
	public CustomerResponse() {
	}

	public CustomerResponse(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccessful() {
		return successful;
	}

	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}

}
