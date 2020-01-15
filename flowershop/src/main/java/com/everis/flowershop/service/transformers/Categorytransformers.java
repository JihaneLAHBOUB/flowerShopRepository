package com.everis.flowershop.service.transformers;

import com.everis.flowershop.repository.entity.Category;
import com.everis.flowershop.service.dto.CategoryDTO;

public class Categorytransformers extends AbstractTransformers<CategoryDTO, Category>{

	//private FlowersTransformer flowerTransformer = new FlowersTransformer() ;
	
	@Override
	public CategoryDTO toDTO(Category entity) {
		CategoryDTO dto = new CategoryDTO();
		
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setDescription(entity.getDescription());
		
//		if( entity.getFlowersList() != null) {
//			dto.setFlowersDTOList(flowerTransformer.toDTOList(entity.getFlowersList()));
//		}
		
		return dto;
	}

	@Override
	public Category toEntity(CategoryDTO dto) {
		Category entity = new Category();

		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setDescription(dto.getDescription());

//		if( dto.getFlowersDTOList() != null) {
//			entity.setFlowers(flowerTransformer.toEntityList(dto.getFlowersDTOList()));
//		}
		return entity;
	}

}
