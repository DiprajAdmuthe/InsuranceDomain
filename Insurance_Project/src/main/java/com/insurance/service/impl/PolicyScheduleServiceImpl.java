package com.insurance.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.insurance.model.PolicySchedule;
import com.insurance.repository.PolicyScheduleRepository;
import com.insurance.service.PolicyScheduleService;

@Service
public class PolicyScheduleServiceImpl implements PolicyScheduleService{
	@Autowired
	private PolicyScheduleRepository policyScheduleRepository;

	@Override
	public PolicySchedule savePolicySchedule(PolicySchedule policyschedule) {
		PolicySchedule savepolicySchedule = policyScheduleRepository.save(policyschedule);
		return savepolicySchedule;
	}

	@Override
	public PolicySchedule updatePolicySchedule(PolicySchedule policyschedule) {
		PolicySchedule updatepolicyschedule = policyScheduleRepository.save(policyschedule);
		return updatepolicyschedule;
	}

//	@Override
//	public PolicySchedule getPolicySchedule(Integer srno) {
//		  
//		  return policyScheduleRepository.findByPolicySchedule(srno);
//	}
	
	

}
