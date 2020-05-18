package com.ex.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CustomerMobileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerMobileServiceApplication.class, args);
	}

}
