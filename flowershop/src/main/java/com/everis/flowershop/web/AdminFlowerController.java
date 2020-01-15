package com.everis.flowershop.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.flowershop.service.FlowersService;
import com.everis.flowershop.service.dto.FlowersDTO;

@Controller
public class AdminFlowerController {

	@Autowired
	private FlowersService flowersService;

//	with jsp pages

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createFlowers";
	}

	@RequestMapping("/saveFlowers")
	public String saveFlowers(@ModelAttribute("FlowersDTO") FlowersDTO flowersDTO, ModelMap modelMap) {

		FlowersDTO flowerDTOSaved = flowersService.saveData(flowersDTO);
		String msg = "Flower saved with id : " + flowerDTOSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createFlowers";
	}

	@RequestMapping("/display")
	public String displayFlowers(ModelMap modelMap) {

		List<FlowersDTO> listFlowerDTO = flowersService.getAllData();
		modelMap.addAttribute("listFlowerDTO", listFlowerDTO);
		return "displayFlowers";
	}

	@RequestMapping("/deleteFlower")
	public String deleteFlowers(@RequestParam("id") Long id, ModelMap modelMap) {

		FlowersDTO flowersDTO = flowersService.getDataById(id);
		flowersService.deleteData(flowersDTO);

		List<FlowersDTO> listFlowerDTO = flowersService.getAllData();
		modelMap.addAttribute("listFlowerDTO", listFlowerDTO);

		return "displayFlowers";
	}

	@RequestMapping("/updateFlower")
	public String updateFlowers(@RequestParam("id") Long id, ModelMap modelMap) {

		FlowersDTO flowersDTO = flowersService.getDataById(id);
		modelMap.addAttribute("Flower", flowersDTO);
		return "editFlowers";

	}

	@RequestMapping("/updateFlowers")
	public String updateFlowers(@ModelAttribute("FlowersDTO") FlowersDTO flowersDTO, ModelMap modelMap) {
		
		System.out.println("before update: "+flowersDTO);
		flowersService.updateData(flowersDTO);
		System.out.println("after update: "+flowersDTO);
		List<FlowersDTO> listFlowerDTO = flowersService.getAllData();
		modelMap.addAttribute("listFlowerDTO", listFlowerDTO);
		System.out.println("after getall: "+listFlowerDTO);
		return "displayFlowers";
	}
	
	
	
//	with postman

	@GetMapping("/Flower")
	public List<FlowersDTO> home() {

		List<FlowersDTO> listFlowerDTO = flowersService.getAllData();

		return listFlowerDTO;
	}
	
	@PostMapping("/addFlower")
	public FlowersDTO saveFlowers(@RequestBody FlowersDTO flowersDTO) {

		FlowersDTO dto = flowersService.saveData(flowersDTO);
		return dto;
	}

	@GetMapping("/displayAllFlowers")
	public List<FlowersDTO> displayFlowers() {

		List<FlowersDTO> listFlowerDTO = flowersService.getAllData();

		return listFlowerDTO;
	}

	@DeleteMapping("/deleteFlower/{id}")
	public List<FlowersDTO> deleteFlowers(@PathVariable("id") Long id) {

		FlowersDTO flowersDTO = flowersService.getDataById(id);
		flowersService.deleteData(flowersDTO);

		List<FlowersDTO> listFlowerDTO = flowersService.getAllData();

		return listFlowerDTO;
	}

	@PutMapping("/updateFlower/{id}")
	public List<FlowersDTO> updateFlowers(@PathVariable("id") Long id, @RequestBody FlowersDTO flowersDTO) {

		flowersDTO.setId(id);
		flowersService.updateData(flowersDTO);
		List<FlowersDTO> listFlowerDTO = flowersService.getAllData();

		return listFlowerDTO;
	}



}
