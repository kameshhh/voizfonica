package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.ContactUs;
//import com.example.entities.User;
import com.example.entities.Users;


@Repository
public interface NewUserDao extends JpaRepository<Users, String> {
 Users save(Users userData);
 Users findByEmail(String email);
 ContactUs save(ContactUs userData);


	
}
