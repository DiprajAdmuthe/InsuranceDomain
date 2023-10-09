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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Claim;
import com.insurance.model.Premium;
import com.insurance.model.User;
import com.insurance.service.ClaimService;
import com.insurance.service.PremiumService;
import com.insurance.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private ClaimService claimService;
	@Autowired
	private PremiumService premiumService;
	
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
	ResponseEntity<User> getUserClaim(@PathVariable("id") Integer id){
		User userids = userService.getUserById(id);
		List<Claim> claimids = userids.getClaimList();	
		for(Claim claim:claimids) {
			claim.setUserid(userids.getId());
			claimService.getClaimById(id);
		}
		return ResponseEntity.ok().body(userids);
		
	}
	
	//Design API to store user with multiple premium details into database.
	@PostMapping("/saveUserPremium")
	ResponseEntity<User> saveUserPremium(@RequestBody User user){
		User users=userService.saveUser(user);
		List<Premium> premiumlists=user.getPremiumList();
		
		for(Premium premiums:premiumlists) {
			premiums.setUserid(user.getId());
			premiumService.savePremiumDetails(premiums);
		}
		return ResponseEntity.ok().body(users);
		
	}
	
	//Design API to get user with multiple premium details from database
	@GetMapping("/getUserPremium/{id}")
        ResponseEntity<User> getUserPremium(@PathVariable("id") Integer id){
        	User useridss=userService.getUserById(id);
        	List<Premium> listsofPremium=useridss.getPremiumList();
        	for(Premium premium:listsofPremium) {
        		premium.setUserid(useridss.getId());
        		premiumService.updatePremiumDetails(premium);
        	}
			return ResponseEntity.ok().body(useridss);
        	
        }
	
//	@GetMapping("/updateUserpassword/{firstname}")
//	public boolean updateUserpassword(@PathVariable("firstname") String firstname,@RequestParam("password") String password) throws Exception {
//		User users=userService.updateUserpassword(firstname);
//	
//		if(users!=null) {
//			users.setPassword(password);
//			userService.updateUserpassword(firstname);
//			return true;
//		}
//		return false;	
//	}
	
	

}
