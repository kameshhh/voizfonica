package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PostpaidPlansDao;
import com.example.dao.RechargeDao;
import com.example.entities.PostpaidPlans;
import com.example.entities.RechargeHistory;
import com.example.entities.Users;


@Service
@Transactional
public class RechargeService {
	
	@Autowired
	RechargeDao recharge;
	
	
	public RechargeHistory saverechargehistory(RechargeHistory postpaiddetails) {
		recharge.save(postpaiddetails);
		return postpaiddetails;
	}
	
	public User saveuserhistory(User postpaiddetails) {
		recharge.save(postpaiddetails);
		return postpaiddetails;
	}

//	public List<RechargeHistory> getRechargeHistoryByEmail(Users users) {
//		// TODO Auto-generated method stub
//		return recharge.findHistoryByEmailId(users.getEmail());
//	}

	
	public List<RechargeHistory> getAllRechargedetails(){
		return recharge.findAll();
	}

	public List<RechargeHistory> getRechargeHistoryByEmail(Users users) {
		// TODO Auto-generated method stub
		return recharge.findHistoryByEmail(users.getEmail());
	}

	public List<RechargeHistory> getRechargeHistoryByIdEmail(String email) {
		// TODO Auto-generated method stub
		return recharge.findByEmail(email);
	}
}
