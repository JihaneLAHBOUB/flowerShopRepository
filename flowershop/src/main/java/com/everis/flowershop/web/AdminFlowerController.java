package com.everis.flowershop.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.flowershop.service.FlowersService;
import com.everis.flowershop.service.dto.FlowersDTO;

@Controller
public class AdminFlowerController {

	@Autowired
	private FlowersService flowersService;

	@RequestMapping("/showCreate")
	public String showCreate() {
		System.out.println("here");
		return "createFlowers";
	}

	@RequestMapping("/saveFlowers")
	public String saveFlowers(@ModelAttribute("FlowersDTO") FlowersDTO flowersDTO, ModelMap modelMap) {

		FlowersDTO flowerDTOSaved = flowersService.saveData(flowersDTO);
		String msg = "Flower saved with id : " + flowerDTOSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createFlowers";
	}

	@RequestMapping("/displayAllFlowers")
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

		flowersService.updateData(flowersDTO);
		List<FlowersDTO> listFlowerDTO = flowersService.getAllData();
		modelMap.addAttribute("listFlowerDTO", listFlowerDTO);
		return "displayFlowers";
	}

}
