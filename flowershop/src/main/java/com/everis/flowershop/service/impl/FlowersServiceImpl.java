package com.everis.flowershop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.flowershop.repository.CategoryDAO;
import com.everis.flowershop.repository.FlowersDAO;
import com.everis.flowershop.repository.entity.Flowers;
import com.everis.flowershop.service.FlowersService;
import com.everis.flowershop.service.dto.FlowersDTO;
import com.everis.flowershop.service.transformers.FlowersTransformer;

@Service
public class FlowersServiceImpl implements FlowersService {

	@Autowired
	private FlowersDAO flowersDAO;

	@Autowired
	private CategoryDAO categoryDAO;

	public FlowersTransformer transformer = new FlowersTransformer();

	@Override
	public FlowersDTO saveData(FlowersDTO flowerDTO) {

		Flowers flowerToCreate = transformer.toEntity(flowerDTO);
		flowerToCreate.setCategory(categoryDAO.getOne(flowerDTO.getCategory_id()));
		flowerToCreate.setPhotoName("product-11.jpg");
		Flowers createdFlower = flowersDAO.save(flowerToCreate);
		FlowersDTO createdFlowerDTO = transformer.toDTO(createdFlower);

		return createdFlowerDTO;
	}

	@Override
	public FlowersDTO updateData(FlowersDTO flowerDTO) {

		Flowers flowerToUpdate = transformer.toEntity(flowerDTO);
		flowerToUpdate.setCategory(categoryDAO.getOne(flowerDTO.getCategory_id()));
		Flowers updatedFlower = flowersDAO.save(flowerToUpdate);
		FlowersDTO updatedFlowerDTO = transformer.toDTO(updatedFlower);

		return updatedFlowerDTO;
	}

	@Override
	public void deleteData(FlowersDTO flowerDTO) {

		Flowers flowerToDelete = transformer.toEntity(flowerDTO);
		flowersDAO.delete(flowerToDelete);
	}

	@Override
	public FlowersDTO getDataById(Long id) {

		Optional<Flowers> flower = flowersDAO.findById(id);

		if (flower.isPresent()) {

			return transformer.toDTO(flower.get());
		} else {

			return null;
		}
	}

	@Override
	public List<FlowersDTO> getAllData() {

		List<FlowersDTO> listFlowersDTO = new ArrayList<>();

		List<Flowers> listFlowers = flowersDAO.findAll();

		for (Flowers flowers : listFlowers) {
			listFlowersDTO.add(transformer.toDTO(flowers));
		}

		return listFlowersDTO;
	}

}
