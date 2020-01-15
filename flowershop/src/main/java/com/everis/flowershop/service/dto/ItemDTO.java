package com.everis.flowershop.service.dto;

public class ItemDTO {

	private FlowersDTO flowerDTO;
	private int quantity;

	public ItemDTO() {
		super();
	}

	public ItemDTO(FlowersDTO flower, int quantity) {
		super();
		this.flowerDTO = flower;
		this.quantity = quantity;
	}

	public FlowersDTO getFlower() {
		return flowerDTO;
	}

	public void setFlower(FlowersDTO flower) {
		this.flowerDTO = flower;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Item [flowerDTO=" + flowerDTO + ", quantity=" + quantity + "]";
	}

}
