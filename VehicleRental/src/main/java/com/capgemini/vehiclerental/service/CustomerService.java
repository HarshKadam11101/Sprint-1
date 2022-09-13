package com.capgemini.vehiclerental.service;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;

import com.capgemini.vehiclerental.entity.Customer;
import com.capgemini.vehiclerental.exception.CustomerNotFoundException;

public interface CustomerService {

	public Customer saveCustomer(@Valid  @RequestBody Customer customer);

	public Customer fetchCustomerById(Integer id) throws CustomerNotFoundException;

	public String deleteCustomerById(Integer id);

	public Customer updateCustomer(Customer customer);

}
