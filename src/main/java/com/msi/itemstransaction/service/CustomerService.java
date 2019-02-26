package com.msi.itemstransaction.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msi.itemstransaction.model.Customer;
import com.msi.itemstransaction.repository.AbstractRepository;
@Service
public class CustomerService implements AbstractService<Customer> {

	
	@Autowired
	AbstractRepository customerRepository;
	
	
	public List<Customer> get() throws SQLException {
	return customerRepository.get();
	}

	public void create(Customer customer) throws SQLException {
		customerRepository.create(customer);
		
	}




	public Customer getById(long id) {
		return (Customer)customerRepository.getById(id);
	}

}
