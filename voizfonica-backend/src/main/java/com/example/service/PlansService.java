package com.example.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DonglePlansDao;
import com.example.dao.PostpaidPlansDao;
import com.example.dao.PrepaidPlansDao;
import com.example.entities.DonglePlans;
import com.example.entities.PostpaidPlans;
import com.example.entities.PrepaidPlans;

@Service
@Transactional
public class PlansService {
	
	
	public PlansService() {
		System.out.println("<<<<<<<<<<<<<<<POST SERVICE INSTANTIATED>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
	
	@Autowired
	PostpaidPlansDao postpaidPlansDao;
	
	@Autowired
	PrepaidPlansDao prepaidPlansDao;
	
	@Autowired
	DonglePlansDao dongle;
	
	
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
	public void deletePostpaidPlandetails(int id) {
		postpaidPlansDao.deleteById(id);
	}
	public PostpaidPlans updatePostpaidDetails(PostpaidPlans postpaiddetails) {
		// TODO Auto-generated method stub
		return postpaidPlansDao.save(postpaiddetails);
		
	}
	public PrepaidPlans savePrepaidPlandetails(PrepaidPlans prepaiddetails) {
		prepaidPlansDao.save(prepaiddetails);
		return prepaiddetails;
	}
	public List<PrepaidPlans> getAllPrepaidPlandetails(){
		return prepaidPlansDao.findAll();
	}
	public Optional<PrepaidPlans> getPrepaidPlanById(int id){
		return prepaidPlansDao.findById(id);
	}
	public DonglePlans saveDonglePlandetails(DonglePlans dongledetails) {
		dongle.save(dongledetails);
		return dongledetails;
	}
	public List<DonglePlans> getAllDonglePlandetails(){
		return dongle.findAll();
	}
	public Optional<DonglePlans> getDonglePlanById(int id){
		return dongle.findById(id);
	}
	
}
