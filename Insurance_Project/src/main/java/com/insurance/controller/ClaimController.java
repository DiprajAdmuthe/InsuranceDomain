package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Claim;
import com.insurance.service.ClaimService;

@RestController
@RequestMapping("/claimDetails")
public class ClaimController {
	@Autowired
	private ClaimService claimService;
	
	@PostMapping("/saveClaim")
	public Claim saveClaim(@RequestBody Claim claim) {
		Claim saveclaim = claimService.saveClaim(claim);
		return saveclaim;
		
	}

}
