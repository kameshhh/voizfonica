package com.example.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	public  ResponseEntity<?> loginUser(@RequestBody Users userData ,HttpSession session){
		System.out.println(userData);
//		Users user=userService.findByEmailId(userData.getEmail());
//		if(user.getPassword() == null || user.getPassword().equals(userData.getPassword())) {
//			session.setAttribute("user", user);
//			return ResponseEntity.ok(user);
//		}else {
		Users validUser=userService.login(userData);
		if(validUser!=null) {
			session.setAttribute("user", validUser);
			return new ResponseEntity<Users>(validUser,HttpStatus.OK);
		}else {

		return (ResponseEntity<?>) ResponseEntity.internalServerError();
		}
		
	}
	
	
	
	@PostMapping("/contactus")
	public  ResponseEntity<?> contactus(@RequestBody ContactUs userData){
		ContactUs contactObj=null;
		contactObj=userService.saveContact(userData);
		return ResponseEntity.ok(contactObj);
	}
	
	@DeleteMapping("/logout")
	public ResponseEntity<?> logout(HttpSession session){
		Users user=(Users)session.getAttribute("user");
		if(user!=null)
			session.removeAttribute("user");
		session.invalidate();
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	
}
