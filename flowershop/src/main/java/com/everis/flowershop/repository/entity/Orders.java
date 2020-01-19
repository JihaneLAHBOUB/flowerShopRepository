package com.everis.flowershop.repository.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private Date dateCreation;
	private boolean status;

	private String username;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "order_id")
	private List<ItemsCart> itemList;

	public Orders() {
		super();
	}

	public Orders(Long id, String name, Date dateCreation, boolean status, String account) {
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

	public List<ItemsCart> getItemList() {
		return itemList;
	}

	public void setItemList(List<ItemsCart> itemList) {
		this.itemList = itemList;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", name=" + name + ", dateCreation=" + dateCreation + ", status=" + status
				+ ", account=" + username + ", itemList=" + itemList + "]";
	}

}
