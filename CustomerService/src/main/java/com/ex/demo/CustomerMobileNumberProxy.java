package com.ex.demo;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ex.demo.bean.MobileNumber;

@FeignClient(name="customer-mobile-service")
@RibbonClient(name="customer-mobile-service")
public interface CustomerMobileNumberProxy {
	
	@GetMapping("/customer-phone/{customerId}")
	  public List<MobileNumber> getCustomerPhone
	    (@PathVariable("customerId") int customerId);
	

}
