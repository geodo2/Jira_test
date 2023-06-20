package com.example.demo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/hello-world")
public class HelloResource {
    @GET//stes
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }
}