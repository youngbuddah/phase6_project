package com.crs.main.controller;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crs.main.model.Complaints;
import com.crs.main.model.EngineerDuty;
import com.crs.main.service.ComplaintServiceImpl;
import com.crs.main.service.EngineerDutyService;
import com.crs.main.service.EngineerDutyServiceImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/engineerDuty")
public class EngineerDutyController {
	
	@Autowired
	EngineerDutyService engineerDutyService;
	
	@Autowired
	EngineerDutyServiceImpl engineerDutyServiceImpl;
	
	@Autowired
	ComplaintServiceImpl complaintServiceImpl;
	
	
	
	@PostMapping("/addEngineerDuty")
	public boolean addEngineerDuty(@RequestBody Object engineersDutyAssigned) throws NoSuchFieldException{
		int ticketId = (int) ((LinkedHashMap)engineersDutyAssigned).get("ticketId");
		String customerEmail = (String)((LinkedHashMap) engineersDutyAssigned).get("customerEmail");
		String selectedEngineer = (String)((LinkedHashMap) engineersDutyAssigned).get("selectedEngineer");
		System.out.println(ticketId+"---"+customerEmail+"--"+selectedEngineer);
		
		EngineerDuty existingEngineersDuty = engineerDutyServiceImpl.getEngineerAssignedByTicketId(ticketId);
		if (existingEngineersDuty==null) {
			
			EngineerDuty engineerDuty = new EngineerDuty();
			
			engineerDuty.setTicketId(ticketId);
			engineerDuty.setCustomerEmail(customerEmail);
			engineerDuty.setEngineerEmail(selectedEngineer);
			
			engineerDutyService.saveEngineerDuty(engineerDuty);
			return true;
		}
		return false;
	}
	@PostMapping("/updateStatus")
	public boolean updateStatus(@RequestBody Object statusUpdate)throws NoSuchFieldException{
		int ticketId = (int) ((LinkedHashMap)statusUpdate).get("ticketId");
		String newStatus = (String)((LinkedHashMap) statusUpdate).get("status");
		System.out.println("------------"+newStatus);
		Complaints complaint = complaintServiceImpl.findComplaintById(ticketId);
		if(complaint!=null) {
			complaint.setStatus(newStatus);
			complaintServiceImpl.saveComplaint(complaint);
			return true;
		}
		return false;
	}

}
