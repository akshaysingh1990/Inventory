package com.msi.itemstransaction.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.msi.itemstransaction.model.Item;
import com.msi.itemstransaction.service.ItemService;

@Controller
public class ItemController {

	@Autowired
	ItemService itemService;
	
	@RequestMapping(value = "/getItem", method = RequestMethod.GET)
	public ModelAndView getItem() throws SQLException {
		List<Item> items = new ArrayList<Item>();
		items = itemService.get();
		ModelAndView modelAndView = new ModelAndView("getItem");
		return modelAndView.addObject("items", items);

	}
	
	@RequestMapping(value = "/createItem", method = RequestMethod.GET)
	public String createItem() {
		return "createItem";
	}

	@RequestMapping(value = "/createItem", method = RequestMethod.POST)
	public String createItem(@RequestParam("name") String name, @RequestParam("costPrice") Double costPrice,

			@RequestParam("sellingPrice") Double sellingPrice, @RequestParam("amount") Long amount) throws SQLException {
		Item item = new Item();

		item.setName(name);
		item.setCostPrice(costPrice);
		item.setSellingPrice(sellingPrice);
		item.setAmount(amount);
		itemService.create(item);
		

		return "redirect:" + "/getItem";
	}
	
	
	
	
	
	
	
}
