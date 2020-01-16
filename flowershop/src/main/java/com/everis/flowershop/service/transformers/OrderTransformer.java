package com.everis.flowershop.service.transformers;

import com.everis.flowershop.repository.entity.Orders;
import com.everis.flowershop.service.dto.OrdersDTO;

public class OrderTransformer extends AbstractTransformers<OrdersDTO, Orders> {

//	private AccountTransformer accountTransformer = new AccountTransformer();
//	private OrderDetailTransformer orderDetailTransformer = new OrderDetailTransformer();
	
	@Override
	public OrdersDTO toDTO(Orders entity) {

		OrdersDTO dto = new OrdersDTO();
		
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setStatus(entity.isStatus());
		dto.setDateCreation(entity.getDateCreation());
//		dto.setAccountDTO(accountTransformer.toDTO(entity.getAccount()));
//		dto.setOrderDetailsDTO(orderDetailTransformer.toDTOList(entity.getOrderDetails()));
		return dto;
	}

	@Override
	public Orders toEntity(OrdersDTO dto) {
		
		Orders entity = new Orders();
		
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setStatus(dto.isStatus());
		entity.setDateCreation(dto.getDateCreation());
//		entity.setAccount(accountTransformer.toEntity(dto.getAccountDTO()));
//		entity.setOrderDetails(orderDetailTransformer.toEntityList(dto.getOrderDetailsDTO()));
		
		return entity;
	}

}
