package com.example.service;

import javax.transaction.Transactional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PostpaidPlansDao;
import com.example.dao.RechargeDao;
import com.example.entities.PostpaidPlans;
import com.example.entities.RechargeHistory;


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

}
