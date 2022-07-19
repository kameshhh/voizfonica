package com.example.dao;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.RechargeHistory;

@Repository
public interface RechargeDao extends JpaRepository<RechargeHistory, Integer> {

	User save(User postpaiddetails);

	List<RechargeHistory> findHistoryByEmail(String email);

	List<RechargeHistory> findByEmail(String email);

//	List<RechargeHistory> findHistoryByEmailId(String email);

}
