package com.example.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PostpaidPlansDao;
import com.example.entities.PostpaidPlans;

@Service
@Transactional
public class PlansService {
	
	
	public PlansService() {
		System.out.println("<<<<<<<<<<<<<<<POST SERVICE INSTANTIATED>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
	
	@Autowired
	PostpaidPlansDao postpaidPlansDao;
	
	
	public PostpaidPlans savePostpaidPlandetails(PostpaidPlans postpaiddetails) {
		postpaidPlansDao.save(postpaiddetails);
		return postpaiddetails;
	}
	public List<PostpaidPlans> getAllPostpaidPalndetails(){
		return postpaidPlansDao.findAll();
	}
	public Optional<PostpaidPlans> getPostpaidPlanById(int id){
		return postpaidPlansDao.findById(id);
	}
//	public PostpaidPlans updatePostpaidDetails(PostpaidPlans postpaiddetails) {
//		return postpaidPlansDao.save(postpaiddetails);
//	}
	public void deletePostpaidPlandetails(int id) {
		postpaidPlansDao.deleteById(id);
	}
	public PostpaidPlans updatePostpaidDetails(PostpaidPlans postpaiddetails) {
		// TODO Auto-generated method stub
		return postpaidPlansDao.save(postpaiddetails);
		
	}
}
