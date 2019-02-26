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

import com.msi.itemstransaction.model.Customer;
import com.msi.itemstransaction.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/getCustomer", method = RequestMethod.GET)
	public ModelAndView getCustomer() throws SQLException {
		List<Customer> customers = new ArrayList<Customer>();
		customers = customerService.get();
		ModelAndView modelAndView = new ModelAndView("getCustomer");
		return modelAndView.addObject("customers", customers);

	}
	
	@RequestMapping(value = "/createCustomer", method = RequestMethod.GET)
	public String createCustomer() {
		return "createCustomer";
	}

	@RequestMapping(value = "/createCustomer", method = RequestMethod.POST)
	public String createcustomer(@RequestParam("name") String name, @RequestParam("mobileNumber") String mobileNumber,

			@RequestParam("address") String address) throws SQLException {
		Customer customer = new Customer();

		customer.setName(name);
		customer.setMobileNumber(mobileNumber);
		customer.setAddress(address);
		customerService.create(customer);
		

		return "redirect:" + "/getCustomer";
	}
	
	
	
	
	
	
	
}
