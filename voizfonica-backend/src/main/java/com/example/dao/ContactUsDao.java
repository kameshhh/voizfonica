package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.ContactUs;

public interface ContactUsDao extends JpaRepository<ContactUs, Integer> {

}
