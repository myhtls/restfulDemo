package com.restfuldemo.resource;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.restfuldemo.api.UserResource;

@ApplicationPath(value="/webapi")
public class AppRestfulResource extends Application{

	@Override
	public Set<Class<?>> getClasses() {
		 final Set<Class<?>> classes = new HashSet<>();
		classes.add(UserResource.class);
		return classes;
	}
	
	

}
