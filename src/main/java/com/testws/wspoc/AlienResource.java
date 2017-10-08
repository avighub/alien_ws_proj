package com.testws.wspoc;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
	
	AlienRepository repo=new AlienRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAlien(){
		System.out.println("Calling GET -aliens");
		
		
		return repo.getAliens();
	}
	
	@POST
	@Path("alien")
	public Alien createAlien(Alien a1){
		
		System.out.println("POST a1=" + a1);
		repo.create(a1);
		
		return a1;
		
	}
	
}
