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
		Policy policies = policyService.savePolicy(policy);
		return policies;
	}

	@PutMapping("/updatePolicy")
	public Policy updatePolicy(@RequestBody Policy policy) {
		Policy policyUpdate = policyService.updatePolicy(policy);
		return policyUpdate;
	}

	@GetMapping("/findByPolicyId/{policyid}")
	public Policy findByPolicyId(@PathVariable("policyid") int policyid) {
		Policy policyId = policyService.findByPolicyId(policyid);
		return policyId;
	}

	@DeleteMapping("/deleteByPolicyId/{deleteId}")
	public void deleteByPolicyId(@PathVariable("deleteId") int deleteId) {
		policyService.deleteByPolicyId(deleteId);
	}

	@GetMapping("/getAllPolicy")
	public List<Policy> getAllPolicy() {
		List<Policy> policyList = policyService.getAllPolicy();
		return policyList;
	}

	@DeleteMapping("/deleteAllPolicyDetailse")
	public void deleteAllPolicyDetailse() {
		policyService.deleteAllPolicyDetailse();
	}

}
