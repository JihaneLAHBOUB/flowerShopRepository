package com.everis.flowershop.service.dto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.everis.flowershop.repository.entity.Account;
import com.everis.flowershop.repository.entity.OrderDetail;

public class OrdersDTO {

	private Integer id;
	private AccountDTO account;
	private String name;
	private Date dateCreation;
	private boolean status;
	private List<OrdersDetailDTO> orderDetails = new ArrayList<>();

	public OrdersDTO() {
		super();
	}

	public OrdersDTO(Integer id, AccountDTO account, String name, Date dateCreation, boolean status) {
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

	public AccountDTO getAccountDTO() {
		return account;
	}

	public void setAccountDTO(AccountDTO account) {
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

	public List<OrdersDetailDTO> getOrderDetailsDTO() {
		return orderDetails;
	}

	public void setOrderDetailsDTO(List<OrdersDetailDTO> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", account=" + account + ", name=" + name + ", dateCreation=" + dateCreation
				+ ", status=" + status + ", orderDetails=" + orderDetails +"]";
	}

}
