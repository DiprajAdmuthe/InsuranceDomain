package com.insurance.service;

import com.insurance.model.Policy;

public interface PolicyService {
	
	public Policy savePolicy(Policy policy);
	
	public Policy updatePolicy(Policy policy);
	
	public Policy findByPolicyId(Integer policyid);
	
	//public void deletePolicy(Integer id);

}
