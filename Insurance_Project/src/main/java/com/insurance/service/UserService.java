package com.insurance.service;

import com.insurance.model.User;

public interface UserService {
	
	public User saveUser(User user);
	
	public User updateUser(User User);
	
	public User getUserById(Integer id);
	
	public void deleteUser(Integer id);
	
	//Build the Restful web services to change the user password
	public String updateUser(String password);

}
