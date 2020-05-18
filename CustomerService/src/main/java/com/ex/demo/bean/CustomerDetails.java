package com.ex.demo.bean;

import java.io.Serializable;
import java.util.List;

import com.ex.demo.Customer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerDetails implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Customer customer;
	private CustomerAddress address;
	private List<MobileNumber> phone;
	
	public CustomerDetails() {}

	public CustomerDetails(Customer customer, CustomerAddress address, List<MobileNumber> phone) {
		super();
		this.customer = customer;
		this.address = address;
		this.phone = phone;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CustomerAddress getAddress() {
		return address;
	}

	public void setAddress(CustomerAddress address) {
		this.address = address;
	}

	public List<MobileNumber> getPhone() {
		return phone;
	}

	public void setPhone(List<MobileNumber> phone) {
		this.phone = phone;
	}
	
	
	
		
}
