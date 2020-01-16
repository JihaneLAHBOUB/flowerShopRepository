package com.everis.flowershop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.everis.flowershop.repository.OrderDetailDAO;
import com.everis.flowershop.repository.entity.OrderDetail;
import com.everis.flowershop.service.OrdersDetailService;
import com.everis.flowershop.service.dto.OrdersDetailDTO;
import com.everis.flowershop.service.transformers.OrderDetailTransformer;

public class OrdersDetailServiceImpl implements OrdersDetailService {

	@Autowired
	private OrderDetailDAO orderDetailDAO;
	private OrderDetailTransformer transformer = new OrderDetailTransformer();
	
	@Override
	public OrdersDetailDTO create(OrdersDetailDTO ordersDetailDTO) {
		
		OrderDetail orderDetailToCreate = transformer.toEntity(ordersDetailDTO);
		OrderDetail orderDetailCreated = orderDetailDAO.save(orderDetailToCreate);
		OrdersDetailDTO createdOrderDetailDTO = transformer.toDTO(orderDetailCreated);
		
		return createdOrderDetailDTO;
	}

}
