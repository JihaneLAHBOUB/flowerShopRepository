package com.everis.flowershop.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.flowershop.service.FlowersService;
import com.everis.flowershop.service.dto.FlowersDTO;
import com.everis.flowershop.service.dto.ItemDTO;

@Controller
public class CartController {

	@Autowired
	private FlowersService flowersService;

	@RequestMapping("/product")
	public String displayAllProduct(ModelMap modelMap) {

		List<FlowersDTO> listProductDTO = flowersService.getAllData();
		modelMap.addAttribute("listProductDTO", listProductDTO);
		return "displayProduct";
	}

	@RequestMapping("/addProduct")
	public String addToCart(@RequestParam("id") Long id, ModelMap modelMap, HttpSession session) {

		FlowersDTO flowersDTO = flowersService.getDataById(id);

		if (session.getAttribute("cart") == null) {

			List<ItemDTO> cart = new ArrayList<>();
			cart.add(new ItemDTO(flowersDTO, 1));
			flowersDTO.setQuantity(flowersDTO.getQuantity() - 1);
			flowersService.saveData(flowersDTO);
			session.setAttribute("cart", cart);

		} else {
			List<ItemDTO> cart = (List<ItemDTO>) session.getAttribute("cart");

			int index = isExists(id, cart);
			if (index == -1) {

				cart.add(new ItemDTO(flowersDTO, 1));
				flowersDTO.setQuantity(flowersDTO.getQuantity() - 1);
				flowersService.saveData(flowersDTO);

			} else {

				int quantity = cart.get(index).getQuantity() + 1;
				flowersDTO.setQuantity(flowersDTO.getQuantity() - 1);
				flowersService.saveData(flowersDTO);
				cart.get(index).setQuantity(quantity);

			}
			session.setAttribute("cart", cart);
		}

		return "cart";

	}

	private int isExists(Long id, List<ItemDTO> cart) {
		for (int i = 0; i < cart.size(); i++) {
			if (cart.get(i).getFlower().getId() == id) {
				return i;
			}
		}
		return -1;
	}

}
