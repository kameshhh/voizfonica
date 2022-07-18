package com.example.controllers;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.ErrorClazz;
import com.example.entities.PostpaidPlans;
import com.example.entities.RechargeHistory;
import com.example.service.PlansService;
import com.example.service.RechargeService;


@RestController
@RequestMapping("/recharge")
@CrossOrigin(origins="http://localhost:4200")

public class RechargeController {
	
	@Autowired
	private RechargeService plans;
	
	@PostMapping("/save")
	public ResponseEntity<?> saverechargehistory(@RequestBody RechargeHistory plandetails) {
		
		try {
			plandetails=plans.saverechargehistory(plandetails);
			return new ResponseEntity<RechargeHistory>(plandetails, HttpStatus.CREATED);
		}catch(Exception e) {
			ErrorClazz errorClazz=new ErrorClazz(500,e.getMessage());
			return new ResponseEntity<ErrorClazz>(errorClazz,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@PostMapping("/saveuser")
	public ResponseEntity<?> saveuserhistory(@RequestBody User plandetails) {
		
		try {
			plandetails=plans.saveuserhistory(plandetails);
			return new ResponseEntity<User>(plandetails, HttpStatus.CREATED);
		}catch(Exception e) {
			ErrorClazz errorClazz=new ErrorClazz(500,e.getMessage());
			return new ResponseEntity<ErrorClazz>(errorClazz,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
