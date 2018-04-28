package com.bankapp.responses;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerResponse {

	private boolean successful = true;

	public boolean isSuccessful() {
		return successful;
	}

	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}

}
