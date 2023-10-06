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
		User userid=userRepository.findById(id);
		return userid;
	}

}
