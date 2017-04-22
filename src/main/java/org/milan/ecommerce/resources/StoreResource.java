package org.milan.ecommerce.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("stores")
public class StoreResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getStore(){
		return "Hello Store";
	}
}
