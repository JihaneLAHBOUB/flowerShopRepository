//package com.everis.flowershop.repository.entity;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class OrderDetail {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
//	private Orders orders;
//	private Flowers flower;
//	private double price;
//	private int quantity;
//
//	public OrderDetail() {
//		super();
//	}
//
//	public OrderDetail(Integer id, Orders orders, Flowers flower, double price, int quantity) {
//		super();
//		this.id = id;
//		this.orders = orders;
//		this.flower = flower;
//		this.price = price;
//		this.quantity = quantity;
//	}
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public Orders getOrders() {
//		return orders;
//	}
//
//	public void setOrders(Orders orders) {
//		this.orders = orders;
//	}
//
//	public Flowers getFlower() {
//		return flower;
//	}
//
//	public void setFlower(Flowers flower) {
//		this.flower = flower;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
//
//	public int getQuantity() {
//		return quantity;
//	}
//
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//
//	@Override
//	public String toString() {
//		return "OrderDetail [id=" + id + ", orders=" + orders + ", flower=" + flower + ", price=" + price
//				+ ", quantity=" + quantity + "]";
//	}
//
//}
