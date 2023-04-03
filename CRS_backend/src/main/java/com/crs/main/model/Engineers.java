package com.crs.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_engineer")
@Setter
@Getter
public class Engineers {

	@Id
	private String engineerEmail;
	
	private String engineerPassword;
	private String engineerName;

}
