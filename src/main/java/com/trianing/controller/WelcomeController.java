package com.trianing.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("home")
public class WelcomeController {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@Path("/")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Am in Home!";
    }
    
	@Path("/1")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt1() {
        return "Am in Home1!";
    }
}
