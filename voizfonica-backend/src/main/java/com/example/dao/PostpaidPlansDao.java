package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.PostpaidPlans;

@Repository
public interface PostpaidPlansDao extends JpaRepository<PostpaidPlans, Integer> {

}
