package com.everis.flowershop.service.transformers;

import com.everis.flowershop.repository.entity.ItemsCart;
import com.everis.flowershop.service.dto.ItemsCartDTO;

public class ItemTransformer extends AbstractTransformers<ItemsCartDTO, ItemsCart> {

	private FlowersTransformer flowerTransformer = new FlowersTransformer();

	@Override
	public ItemsCartDTO toDTO(ItemsCart entity) {

		ItemsCartDTO dto = new ItemsCartDTO();

		dto.setFlowerDTO(flowerTransformer.toDTO(entity.getFlower()));
		dto.getFlowerDTO().setCategory_id(entity.getFlower().getCategory().getId());
		dto.setQuantity(entity.getQuantity());

		return dto;
	}

	@Override
	public ItemsCart toEntity(ItemsCartDTO dto) {

		ItemsCart entity = new ItemsCart();

		entity.setFlower(flowerTransformer.toEntity(dto.getFlowerDTO()));
		entity.setQuantity(dto.getQuantity());

		return entity;
	}

}
