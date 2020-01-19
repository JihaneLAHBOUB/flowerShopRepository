package com.everis.flowershop.service.dto;

public class FlowersDTO {

	private Long id;
	private String name;
	private String description;
	private double currentPrice;
	private int quantity;
	private String photoName;

	private Long category_id;

	public FlowersDTO() {
		super();
	}

	public FlowersDTO(Long id, String name, double currentPrice, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.currentPrice = currentPrice;
		this.quantity = quantity;
	}

	public FlowersDTO(Long id, String name, String description, double currentPrice, int quantity, String photoName,
			Long category_id) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.currentPrice = currentPrice;
		this.quantity = quantity;
		this.photoName = photoName;
		this.category_id = category_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getPhotoName() {
		return photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}

	public Long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return name + "| Price :" + currentPrice;
	}

}