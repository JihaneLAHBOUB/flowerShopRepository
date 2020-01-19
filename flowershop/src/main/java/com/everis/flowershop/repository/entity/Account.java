package com.everis.flowershop.repository.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	private String username;
	private String password;
	private String fullname;
	private String email;

	public Account() {
		super();
	}

	public Account(String username, String password, String fullname, String email) {
		super();
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Account [username=" + username + ", password=" + password + ", fullname=" + fullname + ", email="
				+ email + "]";
	}

}
