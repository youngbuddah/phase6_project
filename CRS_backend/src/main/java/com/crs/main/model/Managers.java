package com.crs.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_manager")
@Setter
@Getter
public class Managers {

	@Id
	private String managerEmail;
	
	private String managerPassword;
	private String managerName;
	private String managerPincode;
}
