package com.everis.flowershop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.flowershop.repository.OrderDAO;
import com.everis.flowershop.repository.entity.Orders;
import com.everis.flowershop.service.OrdersService;
import com.everis.flowershop.service.dto.OrdersDTO;
import com.everis.flowershop.service.transformers.OrderTransformer;

@Service
public class OrderServiceImpl implements OrdersService {

	@Autowired
	private OrderDAO orderDAO;
	OrderTransformer transformer = new OrderTransformer();

	@Override
	public OrdersDTO create(OrdersDTO ordersDTO) {

		Orders orderToCreate = transformer.toEntity(ordersDTO);
		Orders orderCreated = orderDAO.save(orderToCreate);
		OrdersDTO createdOrderDTO = transformer.toDTO(orderCreated);

		return createdOrderDTO;
	}

}
