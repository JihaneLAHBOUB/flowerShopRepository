package com.everis.flowershop.service.dto;

import java.time.LocalDate;

public class OrdersDTO {

	private Long id;

	private String name;
	private LocalDate dateCreation;
	private boolean status;

	private String usernameDTO;

	public OrdersDTO() {
		super();
	}

	public OrdersDTO(Long id, String name, LocalDate dateCreation, boolean status, String accountDTO) {
		super();
		this.id = id;
		this.name = name;
		this.dateCreation = dateCreation;
		this.status = status;
		this.usernameDTO = accountDTO;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsernameDTO() {
		return usernameDTO;
	}

	public void setUsernameDTO(String usernameDTO) {
		this.usernameDTO = usernameDTO;
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
		return "OrdersDTO [id=" + id + ", name=" + name + ", dateCreation=" + dateCreation + ", status=" + status
				+ ", accountDTO=" + usernameDTO + "]";
	}

}
