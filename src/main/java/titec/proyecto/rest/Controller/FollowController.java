package titec.proyecto.rest.Controller;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;


import javax.ws.rs.Produces;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import titec.proyecto.rest.Model.FollowEntities.CreacionFollow.Follow;
import titec.proyecto.rest.Service.FollowService;

@Path("/follow")
@RequestScoped
public class FollowController {
    @Inject
    private FollowService followService;

    @POST
    @Produces(APPLICATION_JSON)
    @Consumes(APPLICATION_JSON)
    public Response addUsuario(Follow follow){
        Response.ResponseBuilder builder = null;
        try {
            // Store the contact
            followService.insert(follow);
            
            // Create an "ok" response with the persisted contact
            builder = Response.ok();
        } catch (Exception e) {
            // Handle generic exceptions
            builder = Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage());
        }

        return builder.build();
    }

}
