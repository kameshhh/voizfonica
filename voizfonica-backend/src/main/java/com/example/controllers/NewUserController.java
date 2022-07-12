package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.NewUserDao;
import com.example.entities.ContactUs;
import com.example.entities.Users;
import com.example.service.UserService;

@RestController
@RequestMapping("/user")

@CrossOrigin(origins="http://localhost:4200")
public class NewUserController {
	
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/signup")
	public  ResponseEntity<?> signupUser(@RequestBody Users userData){
		String emailId=userData.getEmail();
		if(emailId!=null && !"".equals(emailId)) {
			Users userobj =userService.findByEmailId(emailId);
			if(userobj!= null) {
				return (ResponseEntity<?>) ResponseEntity.internalServerError();
			}
			
		}
		Users userObj=null;
		userObj=userService.saveUser(userData);
		return ResponseEntity.ok(userObj);
		
	}
		
	
	
	@PostMapping("/userlogin")
	public  ResponseEntity<?> loginUser(@RequestBody Users userData){
		System.out.println(userData);
		Users user=userService.findByEmailId(userData.getEmail());
		if(user.getPassword() == null || user.getPassword().equals(userData.getPassword()))
			return ResponseEntity.ok(user);
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
		
	}
	
	
	
	@PostMapping("/contactus")
	public  ResponseEntity<?> contactus(@RequestBody ContactUs userData){
		ContactUs contactObj=null;
		contactObj=userService.saveContact(userData);
		return ResponseEntity.ok(contactObj);
	}
	
}
