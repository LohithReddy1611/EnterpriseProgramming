	package com.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

@Path("")
@ApplicationPath("/c")
public class CalculatorRest extends Application{
	
	@GET
	@Path("/add/{v1}/{v2}")
	@Produces(MediaType.APPLICATION_JSON)
	public String add(@PathParam("v1") int v1,@PathParam("v2") int v2) {
		Integer v3 = v1 + v2;
		return v3.toString();
	}
	
	@POST
	@Path("/sub/{v1}/{v2}")
	@Produces(MediaType.APPLICATION_JSON)
	public String sub(@PathParam("v1") int v1,@PathParam("v2") int v2) {
		Integer v3 = v1 - v2;
		return v3.toString();
	}
}
