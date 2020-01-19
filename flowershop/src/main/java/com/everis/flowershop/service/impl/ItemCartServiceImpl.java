package com.everis.flowershop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.flowershop.repository.ItemDAO;
import com.everis.flowershop.repository.entity.ItemsCart;
import com.everis.flowershop.service.ItemCartService;
import com.everis.flowershop.service.dto.ItemsCartDTO;
import com.everis.flowershop.service.transformers.ItemTransformer;

@Service
public class ItemCartServiceImpl implements ItemCartService {

	@Autowired
	private ItemDAO itemDAO;
	ItemTransformer transformer = new ItemTransformer();

	@Override
	public ItemsCartDTO create(ItemsCartDTO itemsCartDTO) {

		ItemsCart itemToCreate = transformer.toEntity(itemsCartDTO);
		ItemsCart itemCreated = itemDAO.save(itemToCreate);
		ItemsCartDTO createdItemsCartDTO = transformer.toDTO(itemCreated);
		createdItemsCartDTO.getFlowerDTO().setCategory_id(itemsCartDTO.getFlowerDTO().getCategory_id());
		return createdItemsCartDTO;
	}

}
