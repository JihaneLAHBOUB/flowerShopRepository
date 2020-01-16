package com.everis.flowershop.service.transformers;

import com.everis.flowershop.repository.entity.OrderDetail;
import com.everis.flowershop.service.dto.OrdersDetailDTO;

public class OrderDetailTransformer extends AbstractTransformers<OrdersDetailDTO, OrderDetail> {

	private FlowersTransformer flowerTransformer = new FlowersTransformer();
	private OrderTransformer orderTransformer = new OrderTransformer();
	
	@Override
	public OrdersDetailDTO toDTO(OrderDetail entity) {

		OrdersDetailDTO dto = new OrdersDetailDTO();
		
		dto.setId(entity.getId());
		dto.setPrice(entity.getPrice());
		dto.setQuantity(entity.getQuantity());
		dto.setFlowerDTO(flowerTransformer.toDTO(entity.getFlower()));
		dto.setOrdersDTO(orderTransformer.toDTO(entity.getOrders()));
		
		return dto;
	}

	@Override
	public OrderDetail toEntity(OrdersDetailDTO dto) {
		
		OrderDetail entity = new OrderDetail();
		
		entity.setId(dto.getId());
		entity.setPrice(dto.getPrice());
		entity.setQuantity(dto.getQuantity());
		entity.setFlower(flowerTransformer.toEntity(dto.getFlowerDTO()));
		entity.setOrders(orderTransformer.toEntity(dto.getOrdersDTO()));
		
		return entity;
	}

}
