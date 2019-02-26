package com.msi.itemstransaction.repository;

import java.sql.SQLException;
import java.util.List;


public interface AbstractRepository<T> {

	List<T> get() throws SQLException;

	void create(T t) throws SQLException;
	

	T getById(long id);



}
