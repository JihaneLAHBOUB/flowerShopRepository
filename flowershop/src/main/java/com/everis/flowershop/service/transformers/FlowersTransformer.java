package com.everis.flowershop.service.transformers;

import org.springframework.beans.factory.annotation.Autowired;

import com.everis.flowershop.repository.CategoryDAO;
import com.everis.flowershop.repository.entity.Flowers;
import com.everis.flowershop.service.CategoryService;
import com.everis.flowershop.service.dto.FlowersDTO;

public class FlowersTransformer extends AbstractTransformers<FlowersDTO, Flowers> {

//	@Autowired
//	private CategoryService categoryService;
//
//	private Categorytransformers categoryTransformer = new Categorytransformers();

	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private CategoryService categoryService;
	
	@Override
	public FlowersDTO toDTO(Flowers entity) {
		FlowersDTO dto = new FlowersDTO();

		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setDescription(entity.getDescription());
		dto.setCurrentPrice(entity.getCurrentPrice());
		dto.setQuantity(entity.getQuantity());
		dto.setCategory_id(entity.getCategory().getId());
//		System.out.println("before entity.getCategory().getId():"+entity.getCategory().getId());
//		dto.setCategory_id(entity.getCategory().getId());
//		System.out.println("after entity.getCategory().getId():"+entity.getCategory().getId()+" name category:"+entity.getCategory().getName());
		
		return dto;
	}

	@Override
	public Flowers toEntity(FlowersDTO dto) {
		Flowers entity = new Flowers();

		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setDescription(dto.getDescription());
		entity.setCurrentPrice(dto.getCurrentPrice());
		entity.setQuantity(dto.getQuantity());

		// ne pointe plus sur category
		
		//entity.setCategory(new Category(dto.getCategory_id()));
		//entity.setCategory(categoryTransformer.toEntity(categoryService.getDataById(dto.getCategory_id())));

//		System.out.println(categoryService.getDataById(dto.getCategory_id()));
//		entity.setCategory(categoryDAO.getOne(dto.getCategory_id()));

		return entity;
	}

}
