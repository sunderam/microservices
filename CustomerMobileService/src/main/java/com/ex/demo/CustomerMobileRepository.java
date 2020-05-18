package com.ex.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMobileRepository extends JpaRepository<MobileNumber,Integer>{

	List<MobileNumber> findByCustomerId(int customerId);

}
