package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Premium;
import com.insurance.service.PremiumService;

@RestController
@RequestMapping("/premiumDetails")
public class PremiumController {
	@Autowired
	private PremiumService premiumService;
	
	@PostMapping("/savePremiumDetails")
	public Premium savePremiumDetails(@RequestBody Premium premium) {
		Premium savepremium = premiumService.savePremiumDetails(premium);
		return savepremium;
		
	}
	@PutMapping("/updatePremiumDetails")
	public Premium updatePremiumDetails(@RequestBody Premium premium) {
		Premium updatepremium = premiumService.updatePremiumDetails(premium);
		return updatepremium;
		
	}
	@GetMapping("/getAllList")
	public List<Premium> getAllList(@RequestBody Premium premium){
		List<Premium> getAllPremium=premiumService.getAllList(premium);
		return getAllPremium;
		
	}

}
