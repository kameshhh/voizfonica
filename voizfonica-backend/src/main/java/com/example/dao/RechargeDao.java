package com.example.dao;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.RechargeHistory;

@Repository
public interface RechargeDao extends JpaRepository<RechargeHistory, Integer> {

	User save(User postpaiddetails);

}
