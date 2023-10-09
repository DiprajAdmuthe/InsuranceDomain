package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.User;
import com.insurance.repository.UserRepository;
import com.insurance.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		User saveUser=userRepository.save(user);
		return saveUser;
	}

	@Override
	public User updateUser(User user) {
		User updateUser=userRepository.save(user);
		return updateUser;
	}

	@Override
	public User getUserById(Integer id) {
		User useid=userRepository.findById(id);
		return useid;
	}

	@Override
	public void deleteUser(Integer id) {
		
		userRepository.deleteById(id);
	}
    ////Build the Restful web services to change the user password

//	@Override
//	public User updateUserpassword(String firstname) throws Exception {
//		User username=userRepository.findByUsername(firstname);
//		if(username!= null) {
//			throw new Exception("User not found");
//		}
//		return username;
//	}

	
    
	

	

}
