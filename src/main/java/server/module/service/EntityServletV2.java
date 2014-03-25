package server.module.service;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

@Path("/entityservlet/v2")
public class EntityServletV2 {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String returnBasicJson(){
		return "{ 'content':a very basic string. }";
	}
}
