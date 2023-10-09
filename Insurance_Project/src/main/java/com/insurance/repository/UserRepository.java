package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Serializable>{
	
	public User findById(Integer id);
	
	
	
	//public String findByPassword(String password);

	//public String save(String user);

	//public User findByUsername(String firstname);
	
	

}
