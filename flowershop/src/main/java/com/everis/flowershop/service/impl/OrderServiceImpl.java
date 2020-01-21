package com.everis.flowershop.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	public OrdersDTO saveData(OrdersDTO ordersDTO) {

		Orders orderToCreate = transformer.toEntity(ordersDTO);
		Orders orderCreated = orderDAO.save(orderToCreate);
		OrdersDTO createdOrderDTO = transformer.toDTO(orderCreated);
		return createdOrderDTO;
	}

	@Override
	public List<OrdersDTO> getAllData() {

		List<OrdersDTO> listOrderDTO = new ArrayList<>();
		List<Orders> listOrder = orderDAO.findAll();

		for (Orders orders : listOrder) {
			listOrderDTO.add(transformer.toDTO(orders));
		}

		return listOrderDTO;
	}

	@Override
	public OrdersDTO updateData(OrdersDTO orderDTO) {

		Orders orderToUpdate = transformer.toEntity(orderDTO);
		orderToUpdate.setStatus(true);
		orderToUpdate.setName("Validate Order");
		orderToUpdate.setDateCreation(LocalDate.now());
		Orders orderUpdated = orderDAO.save(orderToUpdate);
		OrdersDTO updatedOrderDTO = transformer.toDTO(orderUpdated);

		return updatedOrderDTO;
	}

	@Override
	public void deleteData(OrdersDTO orderDTO) {

		Orders orderToDelete = transformer.toEntity(orderDTO);
		orderDAO.delete(orderToDelete);

	}

	@Override
	public OrdersDTO getDataById(Long id) {

		Optional<Orders> order = orderDAO.findById(id);

		if (order.isPresent()) {

			return transformer.toDTO(order.get());
		}

		return null;
	}

}
