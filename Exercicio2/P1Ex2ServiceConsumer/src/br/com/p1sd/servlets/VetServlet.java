package br.com.p1sd.servlets;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.com.p1sd.model.Vet;

@Path("/vet")
public class VetServlet {
	
	// http://localhost:8080/P1Ex2ServiceConsumer/rest/vet
	
	private static List<Vet> vets = new ArrayList<>();

	@GET
	@Path("/")
	@Produces("application/json")
	public Response getAll() {
		String json = "[";
		
		for (Vet vet : vets) {
			json += (json.length() == 1 ? "" : ",") + vet.toJson();
		}
		
		json += "]";
		
		return Response.status(200).entity(json).build();
	}
	
	@POST
	@Path("/")
	@Consumes("application/json")
	public Response insert(Vet vet) {
		vets.add(vet);
		
		return Response.status(201).entity("Success").build();
	}

}
