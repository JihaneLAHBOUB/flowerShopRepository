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
		dto.setQuantity(entity.getQuantity());
		dto.setCategory_id(entity.getCategory().getId());

		return dto;
	}

	@Override
	public Flowers toEntity(FlowersDTO dto) {
		Flowers entity = new Flowers();

		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setDescription(dto.getDescription());
		entity.setCurrentPrice(dto.getCurrentPrice());
		entity.setQuantity(dto.getQuantity());

		return entity;
	}

}
