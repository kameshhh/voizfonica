package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.DonglePlans;


@Repository
public interface DonglePlansDao extends JpaRepository<DonglePlans, Integer> {

}
