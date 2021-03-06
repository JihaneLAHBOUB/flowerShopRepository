package com.everis.flowershop.repository.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private LocalDate dateCreation;
	private boolean status;

	private String username;

	public Orders() {
		super();
	}

	public Orders(Long id, String name, LocalDate dateCreation, boolean status, String account) {
		super();
		this.id = id;
		this.name = name;
		this.dateCreation = dateCreation;
		this.status = status;
		this.username = account;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", name=" + name + ", dateCreation=" + dateCreation + ", status=" + status
				+ ", account=" + username + "]";
	}

}
