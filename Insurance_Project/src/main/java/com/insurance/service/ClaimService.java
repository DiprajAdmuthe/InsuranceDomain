package com.insurance.service;

import com.insurance.model.Claim;

public interface ClaimService {
	
	public Claim saveClaim(Claim claim);
	
	public Claim updateClaim(Claim claim);
	
	public Claim getClaimById(Integer id);
	
	public void deleteClaimDetails(Integer id);

}
