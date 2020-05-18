package com.ex.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileNoController {
	
	@Autowired
	private CustomerMobileRepository mobileNumberRepository;

	
	@GetMapping("/customer-phone/{customerId}")
	public List<MobileNumber> getMobileNumber(@PathVariable int customerId){
		return mobileNumberRepository.findByCustomerId(customerId);
	}
}
