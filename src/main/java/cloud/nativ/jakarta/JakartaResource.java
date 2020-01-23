package cloud.nativ.jakarta;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collections;
import java.util.Map;

@ApplicationScoped
@Path("jakarta.ee")
@Produces({MediaType.APPLICATION_JSON})
public class JakartaResource {

    @GET
    public Response index() {
        Map<String, String> message = Collections.singletonMap("message", "Jakarta EE 8 with Java 11 on Payara 5.194.");
        return Response.ok(message).build();
    }
}
