package com.billa.prasanna;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/message")
public class MessageService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response getMessage() {
		return Response.status(200).entity("WebService consuming").build() ;
	}
	
}
