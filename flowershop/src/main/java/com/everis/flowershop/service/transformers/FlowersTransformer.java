package com.everis.flowershop.service.transformers;

import com.everis.flowershop.repository.entity.Flowers;
import com.everis.flowershop.service.dto.FlowersDTO;

public class FlowersTransformer extends AbstractTransformers<FlowersDTO, Flowers> {

	@Override
	public FlowersDTO toDTO(Flowers entity) {
		FlowersDTO dto = new FlowersDTO();
		
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setDescription(entity.getDescription());
		dto.setCurrentPrice(entity.getCurrentPrice());
		dto.setPromotion(entity.isPromotion());
		dto.setSelected(entity.isSelected());
		dto.setAvailable(entity.isAvailable());
	//	dto.setCategoryDTO(new CategoryDTO(entity.getCategory().getId(),entity.getCategory().getName(),entity.getCategory().getDescription()));
		return dto;
	}

	@Override
	public Flowers toEntity(FlowersDTO dto) {
		Flowers entity =new Flowers();
		
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setDescription(dto.getDescription());
		entity.setCurrentPrice(dto.getCurrentPrice());
		entity.setPromotion(dto.isPromotion());
		entity.setSelected(dto.isSelected());
		entity.setAvailable(dto.isAvailable());
	//	entity.setCategory(new Category(dto.getCategoryDTO().getId(),dto.getCategoryDTO().getName(),dto.getCategoryDTO().getDescription()));
		return entity;
	}

}
