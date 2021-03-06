package com.msi.itemstransaction.service;

import java.sql.SQLException;
import java.util.List;


public interface AbstractService<T> {
	List<T> get() throws SQLException;
	void create(T t) throws SQLException;
	T getById(long id);
	
}
