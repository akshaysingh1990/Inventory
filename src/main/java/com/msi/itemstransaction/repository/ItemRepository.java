package com.msi.itemstransaction.repository;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.msi.itemstransaction.model.Item;
@Repository
public class ItemRepository implements AbstractRepository<Item> {

	
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Item> get() throws SQLException {
		return em.createQuery("Select t from " + Item.class.getSimpleName() + " t").getResultList();
	}
	
	
	@Transactional
	public void create(Item item) throws SQLException {
	//	if(item.getId() == 0 )
			em.persist(item);
	//	else
	//		em.merge(item);		
	}

	
	public Item getById(long id) {
		Item item = em.find(Item.class, id);
		return item;
	}

}
