package org.milan.ecommerce.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.milan.ecommerce.beans.User;
import org.milan.ecommerce.repository.UserRepo;

public class UserService implements MyService<User> {
	
	private UserRepo userRepo;
	
	HashMap<String, User> users;
//	Gson gson = new Gson();
//	String path = "D:\\Fax 3.2\\Web Programiranje\\apache-tomcat-7.0.68\\webapps\\ecommerce";
////	String path = "C:\\Users\\milan\\workspace_web\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp2\\wtpwebapps\\ecommerce";
//	Type usersType = new TypeToken<ArrayList<User>>() {}.getType();
	
	public UserService() {
		this.userRepo = new UserRepo();
	}
	
	public HashMap<String, User> getAll(){
		return userRepo.getAll();
	}
	
	public List<User> getAllAsList(){
		return new ArrayList<User>(userRepo.getAll().values());
	}
	
	public User getOne(String username){
		return userRepo.getById(username);
	}
	
	public void remove(User user){
		userRepo.delete(user.getUsername());
	}
	
	public void add(User user){
		userRepo.add(user);
	}

}
