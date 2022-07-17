package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.ErrorClazz;
import com.example.entities.PostpaidPlans;
import com.example.service.PlansService;

@RestController
@RequestMapping("/postpaid")
@CrossOrigin(origins="http://localhost:4200")
public class PlansControllers {
	
	public PlansControllers() {
		System.out.println("<<<<<<<<PLANSCONTROLLER INSTANTIATED>>>>>>>>");
	}
	@Autowired
	private PlansService plans;
	
	@PostMapping("/save")
	public ResponseEntity<?> savePostpaidplandetails(@RequestBody PostpaidPlans plandetails) {
		
		try {
			plandetails=plans.savePostpaidPlandetails(plandetails);
			return new ResponseEntity<PostpaidPlans>(plandetails, HttpStatus.CREATED);
		}catch(Exception e) {
			ErrorClazz errorClazz=new ErrorClazz(500,e.getMessage());
			return new ResponseEntity<ErrorClazz>(errorClazz,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
		@GetMapping("/allpostpaidplans")
	public ResponseEntity<?> getAllPostpaidPlandetails(){
		try {
			List<PostpaidPlans> userdetails=plans.getAllPostpaidPalndetails();
			return new ResponseEntity<List<PostpaidPlans>>(userdetails,HttpStatus.OK);
		}catch(Exception e) {
			ErrorClazz errorClazz=new ErrorClazz(500,e.getMessage());
			return new ResponseEntity<ErrorClazz>(errorClazz,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
		@GetMapping("/postpaidplan/{id}")
		public ResponseEntity<?> getPostpaidPlanById(@PathVariable int id){
			Optional<PostpaidPlans> postpaidplandetails=null;
			try {
				postpaidplandetails =plans.getPostpaidPlanById(id);
				return new ResponseEntity<Optional<PostpaidPlans>>(postpaidplandetails,HttpStatus.OK);
			}catch(Exception e) {
				ErrorClazz errorClazz=new ErrorClazz(500,e.getMessage());
				return new ResponseEntity<ErrorClazz>(errorClazz,HttpStatus.INTERNAL_SERVER_ERROR);
			}
	    }
		
		
//		@PutMapping("/update")
//		public ResponseEntity<?> updatePostpaidDetails(@RequestBody PostpaidPlans postpaiddetails){
//			try {
//				plans.updatePostpaidDetails(postpaiddetails);
//				return new ResponseEntity<Void>(HttpStatus.OK);
//			}catch(Exception e) {
//				ErrorClazz errorClazz=new ErrorClazz(500,e.getMessage());
//				return new ResponseEntity<ErrorClazz>(errorClazz,HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//		}
//		
		@DeleteMapping("/delete/{id}")
		public ResponseEntity<?>deletePostpaidPlandetails(@PathVariable int id){
			try {
				plans.deletePostpaidPlandetails(id);
				return new ResponseEntity<Void>(HttpStatus.OK);
			}catch(Exception e) {
				ErrorClazz errorClazz=new ErrorClazz(500,e.getMessage());
				return new ResponseEntity<ErrorClazz>(errorClazz,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		}
}

