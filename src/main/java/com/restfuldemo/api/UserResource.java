package com.restfuldemo.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path(value="/user")
@Produces("text/plain")
public class UserResource {
	
	@GET
	public String getUserInfo(){
		return "hello ";
	}
	

}
