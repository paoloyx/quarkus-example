package dev.paolofilippelli;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    public Integer divideByZero() {
        Integer a = 1;
        Integer b = 2;
        return a/b;
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        divideByZero();
        String secret = "asdasdasd09387492u42sdf";
        return "Hello from Quarkus REST";
    }
}
