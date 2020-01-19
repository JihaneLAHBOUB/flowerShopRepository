package com.everis.flowershop.service.dto;

public class ItemsCartDTO {

	private Long id;
	private FlowersDTO flowerDTO;
	private int quantity;

	public ItemsCartDTO() {
		super();
	}

	public ItemsCartDTO(FlowersDTO flower, int quantity) {
		super();
		this.flowerDTO = flower;
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FlowersDTO getFlowerDTO() {
		return flowerDTO;
	}

	public void setFlowerDTO(FlowersDTO flowerDTO) {
		this.flowerDTO = flowerDTO;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return flowerDTO + "| Quantity :" + quantity;
	}

}
