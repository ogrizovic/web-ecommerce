package org.milan.ecommerce.repository;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;

import org.milan.ecommerce.beans.User;
import org.milan.ecommerce.services.Parser;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class UserRepo implements Repo{

	private HashMap<String, User> users;
	Gson gson = new Gson();
	String path = "D:\\Fax 3.2\\Web Programiranje\\apache-tomcat-7.0.68\\webapps\\ecommerce";
	Type usersType = new TypeToken<ArrayList<User>>() {}.getType();
	PrintWriter pw;
	Parser p = new Parser();
	 
	public UserRepo() {
		this.users = getAll();
	}
	
	@Override
	public HashMap<String, User> getAll(){
		return p.readUsers(path);
	}
	
	@Override
	public User getById(String username){
//		users = getAll();
		return users.get(username);
	}
	
	@Override
	public void add(User user){
		users.put(user.getUsername(), user);
		try {
			pw = new PrintWriter(path + "/beans_users.json");
			pw.write(gson.toJson(new ArrayList<User>(users.values()), usersType));
			pw.close();
			System.out.println("TESTTEST");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	@Override
	public User update(User user) {
		User u = users.get(user.getUsername());
		u = user;
		users.put(u.getUsername(), u);
//		PrintWriter pw;
		try {
			pw = new PrintWriter(path + "/beans_users.json");
			pw.write(gson.toJson(new ArrayList<User>(users.values()), usersType));
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void delete(String username) {
		users.remove(username);
//		PrintWriter pw;
		try {
			pw = new PrintWriter(path + "/beans_users.json");
			pw.write(gson.toJson(new ArrayList<User>(users.values()), usersType));
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
