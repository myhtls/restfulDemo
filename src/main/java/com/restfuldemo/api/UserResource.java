package com.restfuldemo.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.restfuldemo.util.ConfigUtil;
@Path(value="/user")
@Produces("text/plain")
public class UserResource {
	@GET
	public String getUserInfo(){
		System.out.println(ConfigUtil.get("database.jdbc.connectionURL"));
		return "雾神带我飞";
	}
}
