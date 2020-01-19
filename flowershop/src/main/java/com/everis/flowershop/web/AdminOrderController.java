package com.everis.flowershop.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.everis.flowershop.service.OrdersService;
import com.everis.flowershop.service.dto.OrdersDTO;

@Controller
public class AdminOrderController {

	@Autowired
	private OrdersService ordersService;

	@RequestMapping("/displayOrders")
	public String displayOrders(ModelMap modelMap) {

		List<OrdersDTO> listOrdersDTO = ordersService.getAllData();
		modelMap.addAttribute("listOrdersDTO", listOrdersDTO);

		return "displayOrders";

	}

	@RequestMapping("/deleteOrder")
	public RedirectView deleteOrder(@RequestParam("id") Long id, ModelMap modelMap) {

		OrdersDTO ordersDTO = ordersService.getDataById(id);
		ordersService.deleteData(ordersDTO);


		return new RedirectView("displayOrders");
	}

	@RequestMapping("/updateStatus")
	public RedirectView updateStatus(@RequestParam("id") Long id, ModelMap modelMap) {

		OrdersDTO ordersDTO = ordersService.getDataById(id);
		ordersService.updateData(ordersDTO);

		return new RedirectView("displayOrders");
	}
}
