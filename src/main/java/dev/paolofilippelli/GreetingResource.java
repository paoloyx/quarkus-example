package dev.paolofilippelli;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String veryLongAndComplicatedMethodName() {
        String message = "Hello!";
        return "Hello from Quarkus REST";
    }
}
