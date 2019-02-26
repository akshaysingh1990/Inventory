package com.msi.itemstransaction.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msi.itemstransaction.model.Item;
import com.msi.itemstransaction.repository.AbstractRepository;
@Service
public class ItemService implements AbstractService<Item> {

	
	@Autowired
	AbstractRepository itemRepository;
	
	
	public List<Item> get() throws SQLException {
	return itemRepository.get();
	}

	public void create(Item item) throws SQLException {
		itemRepository.create(item);
		
	}




	public Item getById(long id) {
		return (Item)itemRepository.getById(id);
	}

}
