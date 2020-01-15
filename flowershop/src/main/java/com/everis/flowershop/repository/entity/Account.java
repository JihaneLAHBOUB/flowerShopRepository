package com.everis.flowershop.repository.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Account {

	private String username;
	private String password;
	private String fullname;
	private String email;
	private Set<Orders> orders = new HashSet<>();

	public Account() {
		super();
	}

	public Account(String username, String password, String fullname, String email, Set<Orders> orders) {
		super();
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.orders = orders;
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

	public Set<Orders> getOrders() {
		return orders;
	}

	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Account [username=" + username + ", password=" + password + ", fullname=" + fullname + ", email="
				+ email + ", orders=" + orders + "]";
	}

}
