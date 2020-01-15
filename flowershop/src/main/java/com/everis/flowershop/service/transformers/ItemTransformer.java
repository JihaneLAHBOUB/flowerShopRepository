//package com.everis.flowershop.service.transformers;
//
//import com.everis.flowershop.repository.entity.Item;
//import com.everis.flowershop.service.dto.ItemDTO;
//
//public class ItemTransformer extends AbstractTransformers<ItemDTO, Item> {
//
//	private FlowersTransformer flowerTransformer = new FlowersTransformer() ;
//	
//	@Override
//	public ItemDTO toDTO(Item entity) {
//		ItemDTO dto = new ItemDTO();
//		
//		dto.setFlower(flowerTransformer.toDTO(entity.getFlower()));
//		dto.setQuantity(entity.getQuantity());
//		
//		return dto;
//	}
//
//	@Override
//	public Item toEntity(ItemDTO dto) {
//		Item entity = new Item();
//		
//		entity.setFlower(flowerTransformer.toEntity(dto.getFlower()));
//		entity.setQuantity(dto.getQuantity());
//		
//		return entity;
//	}
//
//	
//}
