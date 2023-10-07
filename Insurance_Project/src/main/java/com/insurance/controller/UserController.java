package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.User;
import com.insurance.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		User saveUser=userService.saveUser(user);
		return saveUser;
		
	}
	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user) {
		User updateUser=userService.updateUser(user);
		return updateUser;
		
	}
	@GetMapping("/getUserById/{id}")
	public User getUserById(@PathVariable("id") Integer id) {
		User userid=userService.getUserById(id);
		return userid;
		
	}
	@DeleteMapping("/deleteByUserId/{id}")
	public void deleteByUserId(@PathVariable("id") Integer id) {
		userService.deleteUser(id);
		
	}

}
