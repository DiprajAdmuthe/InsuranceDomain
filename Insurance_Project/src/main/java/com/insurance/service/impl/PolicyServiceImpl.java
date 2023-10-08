package com.insurance.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Policy;
import com.insurance.repository.PolicyRepository;
import com.insurance.service.PolicyService;
@Service
public class PolicyServiceImpl implements PolicyService{
	@Autowired
	private PolicyRepository policyRepository; 

	@Override
	public Policy savePolicy(Policy policy) {
		Policy savePolicy=policyRepository.save(policy);
		return savePolicy;
	}

	@Override
	public Policy updatePolicy(Policy policy) {
		Policy updatePolicy=policyRepository.save(policy);
		return updatePolicy;
	}

	@Override
	public Policy findByPolicyId(Integer policyid) {
		Policy polid=policyRepository.findByPolicyid(policyid);
		return polid;
	}

	@Override
	public List<Policy> getAllPolicy(Policy policy) {
		List<Policy> policieslists=(List<Policy>) policyRepository.findAll();
		return policieslists;
		
		
	}


//	@Override
//	public void deletePolicy(Integer policyid) {
//		policyRepository.deleteById(policyid);
//		
//	}
	


}
