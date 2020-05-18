package com.ex.demo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MobileNumber {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mobileId;
	
	private int customerId;
	
	@Enumerated(EnumType.STRING)
	private NoType noType;
	
	private long mobileNo;
	
	public MobileNumber(){}

	public MobileNumber(int mobileId, int customerId, NoType noType, long mobileNo) {
		super();
		this.mobileId = mobileId;
		this.customerId = customerId;
		this.noType = noType;
		this.mobileNo = mobileNo;
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public NoType getNoType() {
		return noType;
	}

	public void setNoType(NoType noType) {
		this.noType = noType;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	
}
