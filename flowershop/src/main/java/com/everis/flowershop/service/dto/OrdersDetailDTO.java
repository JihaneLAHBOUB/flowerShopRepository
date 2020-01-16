package com.everis.flowershop.service.dto;

public class OrdersDetailDTO {

	private Integer id;
	private OrdersDTO ordersDTO;
	private FlowersDTO flowerDTO;
	private double price;
	private int quantity;

	public OrdersDetailDTO() {
		super();
	}

	public OrdersDetailDTO(Integer id, OrdersDTO ordersDTO, FlowersDTO flowerDTO, double price, int quantity) {
		super();
		this.id = id;
		this.ordersDTO = ordersDTO;
		this.flowerDTO = flowerDTO;
		this.price = price;
		this.quantity = quantity;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public OrdersDTO getOrdersDTO() {
		return ordersDTO;
	}

	public void setOrdersDTO(OrdersDTO orders) {
		this.ordersDTO = orders;
	}

	public FlowersDTO getFlowerDTO() {
		return flowerDTO;
	}

	public void setFlowerDTO(FlowersDTO flower) {
		this.flowerDTO = flower;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", orders="  + ", flower="  + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}

}
