package com.msi.itemstransaction.repository;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.msi.itemstransaction.model.Customer;
@Repository
public class CustomerRepository implements AbstractRepository<Customer> {

	
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Customer> get() throws SQLException {
		return em.createQuery("Select t from " + Customer.class.getSimpleName() + " t").getResultList();
	}
	
	
	@Transactional
	public void create(Customer customer) throws SQLException {
	//	if(customer.getId() == 0 )
			em.persist(customer);
	//	else
	//		em.merge(customer);		
	}

	
	public Customer getById(long id) {
		Customer customer = em.find(Customer.class, id);
		return customer;
	}

}
