package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Claim;
import com.insurance.repository.ClaimRepository;
import com.insurance.service.ClaimService;
@Service
public class ClaimServiceImpl implements ClaimService{
	@Autowired
	private ClaimRepository claimRepository;

	@Override
	public Claim saveClaim(Claim claim) {
		Claim saveClaim = claimRepository.save(claim);
		return saveClaim;
	}

	@Override
	public Claim updateClaim(Claim claim) {
		Claim updateclaim = claimRepository.save(claim);
		return updateclaim;
	}

	@Override
	public Claim getClaimById(Integer id) {
		Claim claimid = claimRepository.findById(id);
		return claimid;
	}

	@Override
	public void deleteClaimDetails(Integer id) {
		claimRepository.deleteById(id);
		
	}

}
