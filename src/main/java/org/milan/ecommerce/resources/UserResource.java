package org.milan.ecommerce.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.milan.ecommerce.beans.User;
import org.milan.ecommerce.services.UserService;

@Path("users")
public class UserResource {
	
	UserService userService = new UserService();
	
	public UserResource() {
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUsers(){
		return userService.getAllAsList();
	}
	
	@GET
	@Path("/{username}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(@PathParam("username") String username){
		return userService.getOne(username);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void register(User user){
		userService.add(user);
	}
	
}
