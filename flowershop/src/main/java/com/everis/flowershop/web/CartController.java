package com.everis.flowershop.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.flowershop.service.AccountService;
import com.everis.flowershop.service.FlowersService;
import com.everis.flowershop.service.OrdersService;
import com.everis.flowershop.service.dto.FlowersDTO;
import com.everis.flowershop.service.dto.ItemsCartDTO;
import com.everis.flowershop.service.dto.OrdersDTO;

@Controller
public class CartController {

	@Autowired
	private FlowersService flowersService;

	@Autowired
	private AccountService accountService;

	@Autowired
	private OrdersService ordersService;

	@RequestMapping("/product")
	public String displayAllProduct(ModelMap modelMap) {

		List<FlowersDTO> listProductDTO = flowersService.getAllData();
		modelMap.addAttribute("listProductDTO", listProductDTO);
		return "displayProduct";
	}

	@RequestMapping("/addProduct")
	public String addToCart(@RequestParam("id") Long id, HttpSession session) {

		FlowersDTO flowersDTO = flowersService.getDataById(id);

		if (session.getAttribute("cart") == null) {
			List<ItemsCartDTO> cart = new ArrayList<>();
			cart.add(new ItemsCartDTO(flowersDTO, 1));
			flowersService.saveData(flowersDTO);
			session.setAttribute("cart", cart);

		} else {
			List<ItemsCartDTO> cart = (List<ItemsCartDTO>) session.getAttribute("cart");

			int index = isExists(id, cart);
			if (index == -1) {

				cart.add(new ItemsCartDTO(flowersDTO, 1));
				flowersService.saveData(flowersDTO);

			} else {

				int quantity = cart.get(index).getQuantity() + 1;
				flowersService.saveData(flowersDTO);
				cart.get(index).setQuantity(quantity);

			}
			session.setAttribute("cart", cart);
		}

		return "cart";

	}

	private int isExists(Long id, List<ItemsCartDTO> cart) {
		for (int i = 0; i < cart.size(); i++) {
			if (cart.get(i).getFlowerDTO().getId() == id) {
				return i;
			}
		}
		return -1;
	}

	@RequestMapping("/deleteProduct")
	public String deleteFromCart(@RequestParam("id") Long id, HttpSession session) {
		List<ItemsCartDTO> cart = (List<ItemsCartDTO>) session.getAttribute("cart");
		int index = isExists(id, cart);
		cart.remove(index);
		session.setAttribute("cart", cart);
		return "cart";
	}

	@RequestMapping("/updateProduct")
	public String updateCart(ModelMap modelMap, HttpServletRequest request, HttpSession session) {

		String[] quantities = request.getParameterValues("quantity");
		List<ItemsCartDTO> cart = (List<ItemsCartDTO>) session.getAttribute("cart");

		for (int i = 0; i < cart.size(); i++) {
			cart.get(i).setQuantity(Integer.parseInt(quantities[i]));
		}

		session.setAttribute("cart", cart);
		modelMap.put("total", total(session));
		return "cart";
	}

	private double total(HttpSession session) {
		List<ItemsCartDTO> cart = (List<ItemsCartDTO>) session.getAttribute("cart");
		double somme = 0;
		if (cart != null) {
			for (ItemsCartDTO item : cart) {
				somme += item.getQuantity() * item.getFlowerDTO().getCurrentPrice();
			}
		}
		return somme;
	}

	@RequestMapping("/checkout")
	public String checkout(HttpSession session) {
		if (session.getAttribute("username") == null) {
			return "account";
		} else {
			// add New Order
			OrdersDTO orderDTO = new OrdersDTO();
			orderDTO.setUsernameDTO(
					(accountService.findUser(session.getAttribute("username").toString())).getUsername());

			orderDTO.setName("New Order");
			orderDTO.setStatus(false);
			orderDTO.setDateCreation(new Date());

			// add order detail
			List<ItemsCartDTO> cart = (List<ItemsCartDTO>) session.getAttribute("cart");
			for (ItemsCartDTO itemCart : cart) {

				FlowersDTO flowerDTO = new FlowersDTO(itemCart.getFlowerDTO().getId(),
						itemCart.getFlowerDTO().getName(), itemCart.getFlowerDTO().getDescription(),
						itemCart.getFlowerDTO().getCurrentPrice(), itemCart.getFlowerDTO().getQuantity(),
						itemCart.getFlowerDTO().getPhotoName(), itemCart.getFlowerDTO().getCategory_id());

				flowersService.saveData(flowerDTO);
				List<ItemsCartDTO> item = new ArrayList<>();
				ItemsCartDTO itemsCartDTO = new ItemsCartDTO(flowerDTO, itemCart.getQuantity());

				item.add(itemsCartDTO);
				orderDTO.setItemDTOList(item);
			}

			ordersService.saveData(orderDTO);

			// delete cart
			session.removeAttribute("cart");
			return "thanks";
		}

	}
}
