package com.capgemini.vehiclerental.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue ("A")

public class Admin extends User {

	static final long serialVersionUID = 1L;

	public Admin() {
		
	}
	public Admin(String username, String PAN, String password, String address, String mobileNumber, String email) {
		super(username,PAN,password,address,mobileNumber,email);
	}
	
	@Override
	public String toString() {
		return "Admin [adminId=" + this.getId()+ "]";
		
	}
	

}
