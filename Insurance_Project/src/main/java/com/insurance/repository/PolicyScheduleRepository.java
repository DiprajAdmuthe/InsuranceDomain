package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.PolicySchedule;

@Repository
public interface PolicyScheduleRepository extends CrudRepository<PolicySchedule, Serializable>{
	
	//public PolicySchedule findById(Integer srno);
//	public PolicySchedule findByPolicySchedule(int srno);

}
