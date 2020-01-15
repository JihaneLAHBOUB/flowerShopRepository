//package com.everis.flowershop.service.impl;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.everis.flowershop.repository.CategoryDAO;
//import com.everis.flowershop.repository.ItemDAO;
//import com.everis.flowershop.repository.entity.Category;
//import com.everis.flowershop.repository.entity.Item;
//import com.everis.flowershop.service.CategoryService;
//import com.everis.flowershop.service.ItemService;
//import com.everis.flowershop.service.dto.CategoryDTO;
//import com.everis.flowershop.service.dto.ItemDTO;
//import com.everis.flowershop.service.transformers.Categorytransformers;
//import com.everis.flowershop.service.transformers.ItemTransformer;
//
//@Service
//public class ItemServiceImpl implements ItemService {
//
//	@Autowired
//	ItemDAO itemDAO;
//	ItemTransformer transformer = new ItemTransformer();
//
//	@Override
//	public ItemDTO saveData(ItemDTO itemDTO) {
//
//		Item itemToCreate = transformer.toEntity(itemDTO);
//		Item itemCreated = itemDAO.save(itemToCreate);
//		ItemDTO createdItemDTO = transformer.toDTO(itemCreated);
//
//		return createdItemDTO;
//	}
//
//	@Override
//	public ItemDTO updateData(ItemDTO itemDTO) {
//
//		Item itemUpdate = transformer.toEntity(itemDTO);
//		Item itemUpdated = itemDAO.save(itemUpdate);
//		ItemDTO updatedItemDTO = transformer.toDTO(itemUpdated);
//
//		return updatedItemDTO;
//	}
//
//	@Override
//	public void deleteData(ItemDTO itemDTO) {
//
//		Item itemToDelete = transformer.toEntity(itemDTO);
//		itemDAO.delete(itemToDelete);
//	}
//
//	@Override
//	public ItemDTO getDataById(Long id) {
//
//		Optional<Item> item = itemDAO.findById(id);
//
//		if (item.isPresent()) {
//
//			return transformer.toDTO(item.get());
//		}
//
//		return null;
//	}
//
//	@Override
//	public List<ItemDTO> getAllData() {
//
//		List<Item> listItem = itemDAO.findAll();
//		List<ItemDTO> listItemDTO = new ArrayList<>();
//
//		for (Item item : listItem) {
//			listItemDTO.add(transformer.toDTO(item));
//		}
//
//		return listItemDTO;
//	}
//
//}
