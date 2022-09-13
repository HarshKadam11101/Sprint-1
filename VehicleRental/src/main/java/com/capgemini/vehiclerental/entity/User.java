package com.capgemini.vehiclerental.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;




@Entity
@Table(name="users")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="PAN")
	private String PAN;
	
	@NotNull
	@Column(name="username")
	private String username;
	
	@NotNull
	@Size(min = 4, max = 12, message ="password must be between 3 and 12 characters")
	@Column(name="password")
	private String password;
	
	@Column(name="address")
	private String address;
	
	@Size(min = 10 , max = 10 , message = "should have 10 digits")
	@Column(name="mobile_number")
	private String mobileNumber;
	
	@Email(message = "Invalid email. try Again")
	@Column(name="email")
	private String email;
	
	
	public User() {
		
	}

	public User(String username, String PAN, String password, String address, String mobileNumber, String email) {
	
		this.username = username;
		this.PAN = PAN;
		this.password = password;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
		
	}
	
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPAN() {
		return PAN;
	}

	public void setPAN(String pAN) {
		PAN = pAN;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return  "AbstractUser [id=" + id + ", PAN=" + PAN + ", username=" + username + ", password=" + password
				+ ", address=" + address + ", mobileNumber=" + mobileNumber + ", email=" + email + "]";
	}

	


}
