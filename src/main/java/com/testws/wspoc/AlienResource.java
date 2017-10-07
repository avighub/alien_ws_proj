package com.testws.wspoc;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAlien(){
//		System.out.println("Calling GET -aliens");
		Alien a1= new Alien();
		a1.setName("Avishek");
		a1.setPoints(60);
		
		Alien a2= new Alien();
		a2.setName("Chandan");
		a2.setPoints(60);
		
		List<Alien> aliens= Arrays.asList(a1,a2);
		
		
		return aliens;
	}
}
