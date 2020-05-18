package com.ex.demo;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ex.demo.bean.CustomerAddress;

@FeignClient(name="customer-address-service")
@RibbonClient(name="customer-address-service")
public interface CustomerAddressProxy {

	@GetMapping("/customer-address/{customerId}")
	  public CustomerAddress getCustomerAddress
	    (@PathVariable("customerId") int customerId);
}
