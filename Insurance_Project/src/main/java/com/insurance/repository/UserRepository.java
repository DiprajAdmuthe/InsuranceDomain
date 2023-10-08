package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Serializable>{
	
	public User findById(Integer id);
	
	public void deleteById(int id);
	
	public String findByPassword(String password);
	
	

}
