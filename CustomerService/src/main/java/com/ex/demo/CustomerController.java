package com.ex.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ex.demo.bean.CustomerAddress;
import com.ex.demo.bean.CustomerDetails;
import com.ex.demo.bean.MobileNumber;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerMobileNumberProxy mobileProxy;
	
	@Autowired
	private CustomerAddressProxy addressProxy;
	

	@GetMapping("/customer/{customerId}")
	public CustomerDetails getCustomer(@PathVariable int customerId) {
		CustomerDetails customer = new CustomerDetails();
		customer.setCustomer(customerRepository.getOne(customerId));
		customer.setAddress(addressProxy.getCustomerAddress(customerId));
		customer.setPhone(mobileProxy.getCustomerPhone(customerId));
		return customer;
	}
	
	
	@GetMapping("/getCustomerMobileNo/{customerId}")
	public List<MobileNumber> getCustomerMobileNumber(@PathVariable int customerId) {
		return mobileProxy.getCustomerPhone(customerId);
		//new RestTemplate().getForEntity("http://localhost:8089/get-phone-no/{customerId}", String.class,customerId);
	
	}
	
	@GetMapping("/getCustomerAddress/{customerId}")
	public CustomerAddress getCustomerAddress(@PathVariable int customerId) {
		return addressProxy.getCustomerAddress(customerId); 
		//new RestTemplate().getForEntity("http://localhost:8089/get-address/{customerId}", String.class,customerId);
	
	}
	
}
