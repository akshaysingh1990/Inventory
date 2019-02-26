package com.msi.itemstransaction.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.msi.itemstransaction.model.Customer;
import com.msi.itemstransaction.model.Item;
import com.msi.itemstransaction.service.CustomerService;
import com.msi.itemstransaction.service.ItemService;

@Controller
public class SellItemController {

	@Autowired
	CustomerService customerService;

	@Autowired
	ItemService itemService;

	@RequestMapping(value = "/sellItem", method = RequestMethod.GET)
	public ModelAndView purchase() throws SQLException {

		List<Customer> customers = new ArrayList<Customer>();
		customers = customerService.get();

		List<Item> items = new ArrayList<Item>();
		items = itemService.get();
		ModelAndView modelAndView = new ModelAndView("sellItem");

		modelAndView.addObject("customers", customers);

		modelAndView.addObject("items", items);
		return modelAndView;
	}

	@RequestMapping(value = "/sellItem", method = RequestMethod.POST)
	public String sellItem(@RequestParam("customerName") String customerName, @RequestParam("itemName") String itemName,
		 @RequestParam("quantity") long quantity) throws SQLException {
			
		System.out.println(customerName);
		
		return itemName;
		
		
		
	}
}
