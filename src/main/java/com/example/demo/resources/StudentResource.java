package com.example.demo.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("/student")
public class StudentResource {

  @GET
  @Produces("text/plain")
  public String hello() {
    return "Hello, World!";
  }

  @GET
  @Produces("text/plain")
  public String ping() {
    return ping();
  }

  @GET
  @Produces("text/plain")
  public String ping(@PathParam("") String value){
    return "pong";    
  }
}