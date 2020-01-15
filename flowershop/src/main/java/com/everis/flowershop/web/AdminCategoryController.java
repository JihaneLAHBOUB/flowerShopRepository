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

import com.everis.flowershop.service.CategoryService;
import com.everis.flowershop.service.dto.CategoryDTO;
import com.everis.flowershop.service.dto.FlowersDTO;

@Controller
public class AdminCategoryController {

	@Autowired
	private CategoryService categoryService;

	// with postman
	
	@GetMapping("/Category")
	public List<CategoryDTO> home() {

		List<CategoryDTO> listCategoryDTO = categoryService.getAllData();

		return listCategoryDTO;
	}
	
	@PostMapping("/addCategory")
	public CategoryDTO saveFlowers(@RequestBody CategoryDTO categoryDTO) {
		
		System.out.println("before : "+categoryDTO);
		CategoryDTO categoryTOSaved = categoryService.saveData(categoryDTO);
		System.out.println("after : "+categoryTOSaved);
		return categoryTOSaved;
	}
	
	@GetMapping("/displayAllCategories")
	public List<CategoryDTO>  displayFlowers() {

		List<CategoryDTO> listCategoryDTO = categoryService.getAllData();

		return listCategoryDTO;
	}
	
	@DeleteMapping("/deleteCategory/{id}")
	public List<CategoryDTO> deleteFlowers(@PathVariable("id") Long id) {

		CategoryDTO CategoryDTO = categoryService.getDataById(id);
		categoryService.deleteData(CategoryDTO);

		List<CategoryDTO> listCategoryDTO = categoryService.getAllData();

		return listCategoryDTO;
	}
	
	@PutMapping("/updateCategory/{id}")
	public List<CategoryDTO> updateFlowers(@PathVariable("id") Long id, @RequestBody CategoryDTO categoryDTO) {

		categoryDTO.setId(id);
		categoryService.updateData(categoryDTO);
		List<CategoryDTO> listCategoryDTO = categoryService.getAllData();

		return listCategoryDTO;
	}
	
	
	// with jsp pages
	@RequestMapping("/showCreateCategory")
	public String showCreate() {

		return "createCategory";
	}

	@RequestMapping("/saveCategory")
	public String saveCategory(@ModelAttribute("CategoryDTO") CategoryDTO categoryDTO, ModelMap modelMap) {

		CategoryDTO categoryTOSaved = categoryService.saveData(categoryDTO);
		String msg = "Category saved with id : " + categoryTOSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createCategory";
	}

	@RequestMapping("/displayCategories")
	public String displayCategory(ModelMap modelMap) {

		List<CategoryDTO> listCategoryDTO = categoryService.getAllData();
		modelMap.addAttribute("listCategoryDTO", listCategoryDTO);
		return "displayCategory";
	}

	@RequestMapping("/deleteCategory")
	public String deleteCategory(@RequestParam("id") Long id, ModelMap modelMap) {

		CategoryDTO CategoryDTO = categoryService.getDataById(id);
		categoryService.deleteData(CategoryDTO);

		List<CategoryDTO> listCategoryDTO = categoryService.getAllData();
		modelMap.addAttribute("listCategoryDTO", listCategoryDTO);

		return "displayCategory";
	}

	@RequestMapping("/updateCategory")
	public String updateCategory(@RequestParam("id") Long id, ModelMap modelMap) {

		CategoryDTO categoryDTO = categoryService.getDataById(id);
		modelMap.addAttribute("Category", categoryDTO);
		return "editCategory";

	}

	@RequestMapping("/updateCategories")
	public String updateCategory(@ModelAttribute("CategoryDTO") CategoryDTO CategoryDTO, ModelMap modelMap) {

		categoryService.updateData(CategoryDTO);
		List<CategoryDTO> listCategoryDTO = categoryService.getAllData();
		modelMap.addAttribute("listCategoryDTO", listCategoryDTO);
		return "displayCategory";
	}

}
