package com.everis.flowershop.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.everis.flowershop.service.CategoryService;
import com.everis.flowershop.service.FlowersService;
import com.everis.flowershop.service.dto.CategoryDTO;
import com.everis.flowershop.service.dto.FlowersDTO;

@Controller
public class AdminFlowerController {

	@Autowired
	private FlowersService flowersService;

	@Autowired
	private CategoryService categoryService;

	@RequestMapping("/showCreate")
	public String showCreate(ModelMap modelMap) {
		List<CategoryDTO> categoryList = categoryService.getAllData();
		modelMap.addAttribute("categoryList", categoryList);
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
	public RedirectView deleteFlowers(@RequestParam("id") Long id, ModelMap modelMap) {

		FlowersDTO flowersDTO = flowersService.getDataById(id);
		flowersService.deleteData(flowersDTO);

		return new RedirectView("display");
	}

	@RequestMapping("/updateFlower")
	public String updateFlowers(@RequestParam("id") Long id, ModelMap modelMap) {

		FlowersDTO flowersDTO = flowersService.getDataById(id);
		List<CategoryDTO> categoryList = categoryService.getAllData();
		modelMap.addAttribute("categoryList", categoryList);
		modelMap.addAttribute("Flower", flowersDTO);
		return "editFlowers";

	}

	@RequestMapping("/updateFlowers")
	public RedirectView updateFlowers(@ModelAttribute("FlowersDTO") FlowersDTO flowersDTO, ModelMap modelMap) {

		flowersService.updateData(flowersDTO);

		return new RedirectView("display");
	}

}
