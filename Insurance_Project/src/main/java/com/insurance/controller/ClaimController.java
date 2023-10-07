package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@PutMapping("/updateClaim")
	public Claim updateClaim(@RequestBody Claim claim) {
		Claim updateclaim = claimService.saveClaim(claim);
		return updateclaim;
		
	}
	@GetMapping("/getClaimById/{id}")
	public Claim getClaimById(@PathVariable("id") Integer id) {
		Claim claimids = claimService.getClaimById(id);
		return claimids;
		
	}
	@DeleteMapping("/deleteClaimDetails/{id}")
	public void deleteClaimDetails(@PathVariable("id") Integer id) {
		claimService.deleteClaimDetails(id);
	}

}
