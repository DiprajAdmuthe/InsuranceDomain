package com.insurance.service;

import java.util.List;

import com.insurance.model.Premium;

public interface PremiumService {
	
	public Premium savePremiumDetails(Premium premium);
	
	public Premium updatePremiumDetails(Premium premium);
	
	public List<Premium> getAllList(Premium premium);

}
