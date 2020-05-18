package com.ex.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerAddressController {

	@Autowired
	private CustomerAddressRepository customerAddressRepository;
	
	@GetMapping("/customer-address/{customerId}")
	public CustomerAddress getCustomerAddressByCustomerId(@PathVariable int customerId) {
		return customerAddressRepository.findByCustomerId(customerId);
	}
	
}
