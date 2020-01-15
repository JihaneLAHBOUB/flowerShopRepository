package com.everis.flowershop.service.dto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.everis.flowershop.repository.entity.Account;

public class OrdersDTO {

	private Integer id;
	private Account account;
	private String name;
	private Date dateCreation;
	private boolean status;
//	private List<OrderDetail> orderDetails = new ArrayList<>();

	public OrdersDTO() {
		super();
	}

	public OrdersDTO(Integer id, Account account, String name, Date dateCreation, boolean status) {
		super();
		this.id = id;
		this.account = account;
		this.name = name;
		this.dateCreation = dateCreation;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

//	public List<OrderDetail> getOrderDetails() {
//		return orderDetails;
//	}
//
//	public void setOrderDetails(List<OrderDetail> orderDetails) {
//		this.orderDetails = orderDetails;
//	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", account=" + account + ", name=" + name + ", dateCreation=" + dateCreation
				+ ", status=" + status + ", orderDetails=" + "]";
	}

}
