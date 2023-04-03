package com.crs.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_customer")
@Setter
@Getter

public class Customers {

	@Id
	private String customerEmail;
	
	private String customerPassword;
	private String customerName;
	private String customerMobile;
	private String customerAddress;
	private String customerPincode;
}