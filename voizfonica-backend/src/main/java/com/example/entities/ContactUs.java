package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contactus")
public class ContactUs {
	private String name;
	
	@Id
	private String email;
	private String phonenumber;
	public ContactUs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContactUs(String name, String email, String phonenumber) {
		super();
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

}
