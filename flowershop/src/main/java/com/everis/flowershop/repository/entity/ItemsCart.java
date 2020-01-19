package com.everis.flowershop.repository.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItemsCart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name = "flower_id")
	private Flowers flower;
	private int quantity;

	public ItemsCart() {
		super();
	}

	public ItemsCart(Flowers flower, int quantity) {
		super();
		this.flower = flower;
		this.quantity = quantity;
	}

	public Flowers getFlower() {
		return flower;
	}

	public void setFlower(Flowers flower) {
		this.flower = flower;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Item [flower=" + flower + ", quantity=" + quantity + "]";
	}

}
