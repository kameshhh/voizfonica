package com.example.dao;

import java.util.List;
import java.util.Optional;

//import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.RechargeHistory;
import com.example.entities.Users;


@Repository
public interface AdminDao extends JpaRepository<Users, Integer> {

	
//	 public Users findByEmailAndPassword(String email, String password);


}
