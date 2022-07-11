package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="newusers")
public class Users {
	
	private String firstname;
	private String lastname;
	
	@Id
	private String email;
	private String phno;
	private String password;
	private String confirmpassword;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String firstname, String lastname, String email, String phno, String password,
			String confirmpassword) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phno = phno;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

}
