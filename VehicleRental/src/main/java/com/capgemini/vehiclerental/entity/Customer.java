package com.capgemini.vehiclerental.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue ("C")

public class Customer extends User {
	


	private static final long serialVersionUID = 1L;

	public Customer() {
		
	}
	public Customer(String username, String PAN, String password, String address, String mobileNumber, String email) {
		super(username,PAN,password,address,mobileNumber,email);
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + this.getId()+ "]";
		
	}
}
