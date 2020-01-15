package com.everis.flowershop.service;

import com.everis.flowershop.service.dto.AccountDTO;
import com.everis.flowershop.service.dto.OrdersDTO;

public interface OrdersService {

	public AccountDTO create(OrdersDTO ordersDTO);
	
	
}
