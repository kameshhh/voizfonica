package com.example.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AdminDao;
import com.example.dao.ContactUsDao;
import com.example.dao.GetRechHistoryDao;
import com.example.dao.NewUserDao;
import com.example.entities.ContactUs;
import com.example.entities.RechargeHistory;
import com.example.entities.Users;

@Service
@Transactional
public class AdminService {
	

		public AdminService() {
			System.out.println("<<<<<<<<<<<<<<<POST SERVICE INSTANTIATED>>>>>>>>>>>>>>>>>>>>>>>>>");
		}
		
		@Autowired
		GetRechHistoryDao recharge;
		
		@Autowired
		ContactUsDao contactus;
		
		@Autowired
		AdminDao userdao;
		
//		public Users saveUser(Users userData) {
//			return newUserDao.save(userData);
//
//		}
//		public Users findByEmailId(String email) {
//			return newUserDao.findByEmail(email);
////			return ((UserService) newUserDao).findByEmail(email);			
//		}
//
//		public ContactUs saveContact(ContactUs userData) {
//			contactus.save(userData);
//			return userData;
//		}
		
	public Users saveUserdetails(Users userdetails) {
		userdao.save(userdetails);
		return userdetails;
	}
	public List<Users> getAllUserdetails(){
		return userdao.findAll();
	}
	public Optional<Users> getUserdetailsById(int id){
		return userdao.findById(id);
	}
	public Users updateuserdetails(Users userdetails) {
		return userdao.save(userdetails);
	}
	public void deleteUserdetails(int id) {
		userdao.deleteById(id);
	}
	
//	public List<RechargeHistory> getRechargeHistoryByEmail(Users users) {
////		 TODO Auto-generated method stub
//		return recharge.findHistoryByEmailId(email);
////		return null;
//	}
	
//	public List<RechargeHistory> getRechargeHistoryByEmail(String email){
//		return recharge.findHistoryByEmailId(email);
//	}
	
	
	
	
	}