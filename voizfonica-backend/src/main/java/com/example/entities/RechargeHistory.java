package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rechargehistory")
public class RechargeHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String price;
	private String validity;
	private String description;
	private String email;
	private String phno;
	public RechargeHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RechargeHistory(int id, String price, String validity, String description, String email, String phno) {
		super();
		this.id = id;
		this.price = price;
		this.validity = validity;
		this.description = description;
		this.email = email;
		this.phno = phno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	}