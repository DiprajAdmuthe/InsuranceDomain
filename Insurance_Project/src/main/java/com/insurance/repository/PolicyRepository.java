package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Policy;
import java.util.List;

@Repository
public interface PolicyRepository extends CrudRepository<Policy,Serializable>{
	
	public Policy findByPolicyid(int policyid);
	
	//public void deleteById(int id);

}
