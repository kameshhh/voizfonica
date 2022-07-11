package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.NewUserDao;
import com.example.entities.ContactUs;
import com.example.entities.Users;

@RestController
@RequestMapping("/user")

@CrossOrigin(origins="http://localhost:4200")
public class NewUserController {
	
	@Autowired
	private NewUserDao repo;
	
	@PostMapping("/signup")
	public  ResponseEntity<?> signupUser(@RequestBody Users userData){
		if(repo.findByEmail(userData.getEmail())!=null) 
			return (ResponseEntity<?>) ResponseEntity.internalServerError();
		return ResponseEntity.ok(repo.save(userData));
		
		
	}
	
	@PostMapping("/userlogin")
	public  ResponseEntity<?> loginUser(@RequestBody Users userData){
		System.out.println(userData);
		Users user=repo.findByEmail(userData.getEmail());
		if(user.getPassword() == null || user.getPassword().equals(userData.getPassword()))
			return ResponseEntity.ok(user);
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
		
	}
	
	@PostMapping("/contactus")
	public  ResponseEntity<?> contactus(@RequestBody ContactUs userData){
		return ResponseEntity.ok(repo.save(userData));
		
		
	}
	
}
