package com.crs.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.crs.main.model.EngineerDuty;

public interface EngineerDutyRepository  extends CrudRepository<EngineerDuty, Integer> {

	List<EngineerDuty> findEngineerDutyByEngineerEmail(String engineerEmail);

	EngineerDuty findEngineerDutyByTicketId(int ticketId);

}
