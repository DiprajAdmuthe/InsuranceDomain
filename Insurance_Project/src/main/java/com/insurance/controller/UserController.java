package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Claim;
import com.insurance.model.User;
import com.insurance.service.ClaimService;
import com.insurance.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private ClaimService claimService;
	
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
	@PutMapping("/updateUserPassword/{password}")
	public String updateUserPassword(@PathVariable("password") String password) {
		String updatedpassword=userService.updateUser(password);
		return updatedpassword;
		
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
	//Build the Restful web service to add user with multiple claim details
	@PostMapping("/saveUserClaim")
	ResponseEntity<User> saveUserClaim(@RequestBody User user){
		User user1 = userService.saveUser(user);
		List<Claim> claims = user.getClaimList();
		for(Claim claim:claims) {
			claim.setUserid(user.getId());
			claimService.saveClaim(claim);
		}
		return ResponseEntity.ok().body(user1);
		
	}
	//Build the Restful web service to fetch user with multiple claim details
	@GetMapping("/getUserClaim/{id}")
	ResponseEntity<User> getUserClaim(@PathVariable Integer id){
		User userids = userService.getUserById(id);
		List<Claim> claimids = userids.getClaimList();	
		for(Claim claim:claimids) {
			claim.setUserid(userids.getId());
			claimService.getClaimById(id);
		}
		return ResponseEntity.ok().body(userids);
		
	}

}
