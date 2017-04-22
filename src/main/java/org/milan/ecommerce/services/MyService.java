package org.milan.ecommerce.services;

import java.util.HashMap;
import java.util.List;

public interface MyService<T> {

	public HashMap<String, T> getAll();
	public List<T> getAllAsList();
	public T getOne(String id);
	public void add(T t);
	public void remove(T t);
}
