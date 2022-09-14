package com.capgemini.vehiclerental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.capgemini.vehiclerental.repository.CustomerRepository;
import com.capgemini.vehiclerental.service.CustomerService;

@SpringBootTest
class VehicleRentalApplicationTests {

	@Autowired
	CustomerService customerService;
	
	@MockBean
	CustomerRepository customerrepo;


}
