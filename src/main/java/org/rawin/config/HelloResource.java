package org.rawin.config;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @Inject
    HelloConfig config;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello, " + config.getName() + "! Are you "+ this.config.getAge() + " years old?";
    }
}