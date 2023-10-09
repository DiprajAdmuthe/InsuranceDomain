package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Policy;
import com.insurance.service.PolicyService;

@RestController
@RequestMapping("policydetails")
public class PolicyController {
	@Autowired
	private PolicyService policyService;
	
	@PostMapping("/savePolicy")
	public Policy savePolicy(@RequestBody Policy policy) {
		Policy savePolicy = policyService.savePolicy(policy);
		return savePolicy;
		
	}
	@PutMapping("/updatePolicy")
	public Policy updatePolicy(@RequestBody Policy policy) {
		Policy updatePolicy=policyService.updatePolicy(policy);
		return updatePolicy;
		
	}
	@GetMapping("/getPolicyById/{policyid}")
	public Policy getPolicyById(@PathVariable("policyid") Integer policyid) {
		Policy polices = policyService.findByPolicyId(policyid);
		return polices;
		
	}
	@DeleteMapping("/findById/{policyid}")
	public void deletePolicyId(@PathVariable("policyid") Integer policyid) {
		
		policyService.deletePolicyById(policyid);
		
	}
	@GetMapping("/getAllPolicy")
	public List<Policy> getAllListsOfPolicy(Policy policy){
		List<Policy> allpolicieslists=policyService.getAllPolicy(policy);
		return allpolicieslists;
		
	}


}
