package org.milan.ecommerce.repository;

import java.util.HashMap;

import org.milan.ecommerce.beans.User;

public interface Repo {

	public HashMap<String, User> getAll();
	public User getById(String username);
	public void add(User user);
	public User update(User user);
	public void delete(String username);
	
}
