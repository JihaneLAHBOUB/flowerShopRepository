package com.everis.flowershop.service.dto;

import java.util.List;

public class CategoryDTO {

	private Long id;
	private String name;
	private String description;

	private List<FlowersDTO> flowersDTOList;

	public CategoryDTO() {
		super();
	}

	public CategoryDTO(Long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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

	public List<FlowersDTO> getFlowersDTOList() {
		return flowersDTOList;
	}

	public void setFlowersDTOList(List<FlowersDTO> flowersDTOList) {
		this.flowersDTOList = flowersDTOList;
	}

	@Override
	public String toString() {
		return "CategoryDTO [id=" + id + ", name=" + name + ", description=" + description + ", flowersDTOList="
				+ flowersDTOList + "]";
	}

}
