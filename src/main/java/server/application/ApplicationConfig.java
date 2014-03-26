package server.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import server.module.service.EntityServletV3;

@javax.ws.rs.ApplicationPath("service")
public class ApplicationConfig extends Application {
	static Set<Class<?>> classes = new HashSet<Class<?>>();
	static {
		classes.add(EntityServletV3.class);
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		// TODO Auto-generated method stub
		return classes;
	}
}