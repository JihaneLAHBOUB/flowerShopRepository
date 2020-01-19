package com.everis.flowershop.service.transformers;

import com.everis.flowershop.repository.entity.Orders;
import com.everis.flowershop.service.dto.OrdersDTO;

public class OrderTransformer extends AbstractTransformers<OrdersDTO, Orders> {

	@Override
	public OrdersDTO toDTO(Orders entity) {

		OrdersDTO dto = new OrdersDTO();

		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setStatus(entity.isStatus());
		dto.setDateCreation(entity.getDateCreation());
		dto.setUsernameDTO(entity.getUsername());
		return dto;
	}

	@Override
	public Orders toEntity(OrdersDTO dto) {

		Orders entity = new Orders();

		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setStatus(dto.isStatus());
		entity.setDateCreation(dto.getDateCreation());
		entity.setUsername(dto.getUsernameDTO());
		return entity;
	}

}
