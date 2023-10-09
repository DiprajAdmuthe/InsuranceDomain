package com.insurance.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Premium;
import com.insurance.service.PremiumService;

@RestController
@RequestMapping("/premiumdetails")
public class PremiumController {

	@Autowired
	private PremiumService premiumService;

	@PostMapping("/savePremium")
	public Premium savePremium(@RequestBody Premium premium) {
		Premium premium1 = premiumService.savePremium(premium);
		return premium1;
	}

	@PutMapping("/updatePremium")
	public Premium updatePremium(@RequestBody Premium premium) {
		Premium updatePremium = premiumService.updatePremium(premium);
		return updatePremium;
	}

	@GetMapping("/getAllPremiumDetails")
	public List<Premium> getAllPremiumDetails() {
		List<Premium> premiumList = premiumService.getAllPremiumDetails();
		return premiumList;
	}

	@DeleteMapping("/deleteByPremiumId/{deleteId}")
	public void deleteByPremiumId(@PathVariable("deleteId") int deleteId) {
		premiumService.deleteByPremiumId(deleteId);
	}

	@GetMapping("/getPremiumsInDuration")
	public ResponseEntity<List<Premium>> getPremiumsInDuration(
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate,
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate) {
		try {
			List<Premium> premiums = premiumService.getPremiumsInDuration(startDate, endDate);
			if (premiums.isEmpty()) {
				return ResponseEntity.noContent().build();// No premiums found
			}
			return ResponseEntity.ok(premiums);// Return premiums in JSON format
		} catch (Exception e) {
			// Handle other errors, e.g., database errors
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

}
