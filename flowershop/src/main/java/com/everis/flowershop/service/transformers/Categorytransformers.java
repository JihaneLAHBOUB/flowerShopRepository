package com.everis.flowershop.service.transformers;

import com.everis.flowershop.repository.entity.Category;
import com.everis.flowershop.service.dto.CategoryDTO;

public class Categorytransformers extends AbstractTransformers<CategoryDTO, Category> {

	@Override
	public CategoryDTO toDTO(Category entity) {
		CategoryDTO dto = new CategoryDTO();

		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setDescription(entity.getDescription());

		return dto;
	}

	@Override
	public Category toEntity(CategoryDTO dto) {
		Category entity = new Category();

		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setDescription(dto.getDescription());

		return entity;
	}

}
