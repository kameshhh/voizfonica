package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="newusers")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstname;
	private String lastname;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int id, String firstname, String lastname, String verificationCode, boolean enabled, String role,
			String email, String phno, String password) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.verificationCode = verificationCode;
		this.enabled = enabled;
		this.role = role;
		this.email = email;
		this.phno = phno;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getVerificationCode() {
		return verificationCode;
	}
	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
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
	private String verificationCode;
	private boolean enabled;
	private String role;
	private String email;
	private String phno;
	private String password;
//	public Users() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Users(String firstname, String lastname, String email, String phno, String password,
//			String confirmpassword) {
//		super();
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.email = email;
//		this.phno = phno;
//		this.password = password;
//		this.confirmpassword = confirmpassword;
//	}
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getFirstname() {
//		return firstname;
//	}
//	public void setFirstname(String firstname) {
//		this.firstname = firstname;
//	}
//	public String getLastname() {
//		return lastname;
//	}
//	public void setLastname(String lastname) {
//		this.lastname = lastname;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getPhno() {
//		return phno;
//	}
//	public void setPhno(String phno) {
//		this.phno = phno;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getConfirmpassword() {
//		return confirmpassword;
//	}
//	public void setConfirmpassword(String confirmpassword) {
//		this.confirmpassword = confirmpassword;
//	}

}
