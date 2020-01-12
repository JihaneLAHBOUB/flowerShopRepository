package com.everis.flowershop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.flowershop.repository.CategoryDAO;
import com.everis.flowershop.repository.entity.Category;
import com.everis.flowershop.service.CategoryService;
import com.everis.flowershop.service.dto.CategoryDTO;
import com.everis.flowershop.service.transformers.Categorytransformers;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryDAO categoryDAO;
	Categorytransformers transformer = new Categorytransformers();

	@Override
	public CategoryDTO saveData(CategoryDTO categoryDTO) {

		Category categoryToCreate = transformer.toEntity(categoryDTO);
		Category categoryCreated = categoryDAO.save(categoryToCreate);
		CategoryDTO createdCateoryDTO = transformer.toDTO(categoryCreated);

		return createdCateoryDTO;
	}

	@Override
	public CategoryDTO updateData(CategoryDTO categoryDTO) {

		Category categoryToUpdate = transformer.toEntity(categoryDTO);
		Category categoryUpdated = categoryDAO.save(categoryToUpdate);
		CategoryDTO updatedCategoryDTO = transformer.toDTO(categoryUpdated);

		return updatedCategoryDTO;
	}

	@Override
	public void deleteData(CategoryDTO categoryDTO) {

		Category categoryToDelete = transformer.toEntity(categoryDTO);
		categoryDAO.delete(categoryToDelete);
	}

	@Override
	public CategoryDTO getDataById(Long id) {

		Optional<Category> category = categoryDAO.findById(id);

		if (category.isPresent()) {

			return transformer.toDTO(category.get());
		}

		return null;
	}

	@Override
	public List<CategoryDTO> getAllData() {

		List<Category> listCategory = categoryDAO.findAll();
		List<CategoryDTO> listCategoryDTO = new ArrayList<>();

		for (Category category : listCategory) {
			listCategoryDTO.add(transformer.toDTO(category));
		}

		return listCategoryDTO;
	}

}
