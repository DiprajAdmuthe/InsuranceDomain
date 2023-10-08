package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Premium;
@Repository
public interface PremiumRepository extends CrudRepository<Premium,Serializable>{
	
	

}
