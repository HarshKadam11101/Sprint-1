package com.capgemini.vehiclerental.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.vehiclerental.entity.Customer;
import com.capgemini.vehiclerental.exception.CustomerNotFoundException;
import com.capgemini.vehiclerental.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/save")
	public Customer saveCustomer(@Valid @RequestBody Customer customer) {
		return customerService.saveCustomer(customer);	
	}
	
	@GetMapping("/fetch/{id}") 
	public Customer fetchCustomerById(@PathVariable("id") Integer id) throws CustomerNotFoundException  {
		return customerService.fetchCustomerById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCustomerById(@PathVariable("id") Integer id) {
		return customerService.deleteCustomerById(id);
	}

	@PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }
}
