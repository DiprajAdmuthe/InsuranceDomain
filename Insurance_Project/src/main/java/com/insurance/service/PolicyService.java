package com.insurance.service;

import java.util.List;

import com.insurance.model.Policy;

public interface PolicyService {
	
	public Policy savePolicy(Policy policy);
	
	public Policy updatePolicy(Policy policy);
	
	public Policy findByPolicyId(Integer policyid);
	
	//public void deletePolicy(Integer id);
	
	public List<Policy> getAllPolicy(Policy policy);

}
