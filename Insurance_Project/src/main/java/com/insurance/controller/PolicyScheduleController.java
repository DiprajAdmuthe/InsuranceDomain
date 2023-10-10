package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PolicySchedule;
import com.insurance.service.PolicyScheduleService;
@RestController
@RequestMapping("/PolicyScheduleDetails")
public class PolicyScheduleController {
	@Autowired
	private PolicyScheduleService policyScheduleService;
	
	@PostMapping("/savePolicySchedule")
	public PolicySchedule savePolicySchedule(@RequestBody PolicySchedule policyschedule) {
		PolicySchedule savepolicySchedule = policyScheduleService.savePolicySchedule(policyschedule);
		return savepolicySchedule;
		
	}
	@PutMapping("/updatepolicyScheduleService")
	public PolicySchedule updatepolicyScheduleService(@RequestBody PolicySchedule policyschedule) {
		PolicySchedule updatepolicySchedule = policyScheduleService.updatePolicySchedule(policyschedule);
		return updatepolicySchedule;
		
	}
	//Design API to fetch policy schedule details from system
//	@GetMapping("/getpolicySchedule/{srno}")
//	public PolicySchedule getpolicySchedule(@PathVariable("srno") Integer srno) {
//		 PolicySchedule policySchedulesrno = policyScheduleService.getPolicySchedule(srno);
//		return policySchedulesrno;
//		
//	}
	

}
