package org.rawin.config;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello2")
public class Hello2Resource {
    
	@Inject
	HelloConfig config;
	
    @GET
    @Produces(value = MediaType.TEXT_PLAIN)
    public String hello2() {
        return "hello2:" + config.getName();
    }
}