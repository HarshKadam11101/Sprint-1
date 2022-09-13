package com.capgemini.vehiclerental.serviceimpl;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.capgemini.vehiclerental.entity.Customer;
import com.capgemini.vehiclerental.exception.CustomerNotFoundException;
import com.capgemini.vehiclerental.repository.CustomerRepository;
import com.capgemini.vehiclerental.service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerrepo;
	
	@Override
	public Customer saveCustomer(@Valid @RequestBody Customer customer) {
		return customerrepo.save(customer);
	}

	@Override
	public Customer fetchCustomerById(Integer id) throws CustomerNotFoundException  {
		 Optional<Customer> customer = customerrepo.findById(id);

		 if(!customer.isPresent()) {
				throw new CustomerNotFoundException("Customer Not Found ");
			}
			return customer.get();
	}

	@Override
	public String deleteCustomerById(Integer id) {
		customerrepo.deleteById(id);
		return "Customer deleted successfully";
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		customerrepo.saveAndFlush(customer);
		return customerrepo.getReferenceById(customer.getId());
	}

}
